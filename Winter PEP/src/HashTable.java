import java.util.HashMap;

public class HashTable {
    private HashNode[] buckets;
    private int numofbuckets;
    int size = 0;
    public HashTable(){
        this(10);
    }
    public HashTable(int capacity){
        this.numofbuckets=capacity;
        this.buckets=new HashNode[capacity];
    }
    public class HashNode{
        private int key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value){
            this.key=key;
            this.value=value;
        }
    }
    public int size(){
        return size;
    }
    public boolean IsEmpty(){
        return size==0;
    }
    
    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("key or value is nul!!");
        }
        int bucketIndex= getBucketIndex(key);
        HashNode head=  buckets[bucketIndex];
        while(head!=null){
            if(head.key==key){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets[bucketIndex];
        HashNode node= new HashNode(key,value);
        node.next=head;
        buckets[bucketIndex]=node;


    }
    public int getBucketIndex(Integer key){
        return key%numofbuckets; //buckets.length
    }
    
    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("key is nul!!");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while(head!=null){
            if(head.key==key){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public String remove(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("key is nul!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while (head != null) {
            if (head.key == key) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if(previous!=null){
            previous.next=head.next;
        }else{
            buckets[bucketIndex]=head.next;
        }
        return head.value;
    }
    
    
    public static void main(String args[]){
    HashTable  table=new HashTable(10);
    table.put(105,"vikash");
    table.put(21,"ram");
    table.put(31,"Patel");
    System.out.println(table.size());
//    System.out.println(table.get(32));
//    System.out.println(table.get(12));
        System.out.println(table.remove(21));
        System.out.println(table.remove(31));
        System.out.println(table.size());

    }
}




