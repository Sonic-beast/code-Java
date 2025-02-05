
public class SLL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insertBegin(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void insertKthpos(int data,int pos){
        Node newNode=new Node(data);
        if(pos<0){
            System.out.println("Position out of bound");
            return;
        }
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of bound");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deletefrombegin(){
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;

    }
    public void deletefromend(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtKthpos(int pos){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid index!");
            return;
        }
        temp.next=temp.next.next;
    }
    public void printlist(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public  static void main(String args[]){
    SLL list=new SLL();
        list.insertBegin(3);
        list.insertBegin(4);
        list.insertBegin(5);
        list.insertBegin(6);
        list.printlist();
        list.insertEnd(0);
        list.printlist();
        list.insertKthpos(9,2);
        list.printlist();
        list.deletefrombegin();
        list.printlist();
        list.deletefromend();
        list.printlist();
        list.deleteAtKthpos(2);
        list.printlist();
    }
}

//sort list
//delete by position