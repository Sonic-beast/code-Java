
public class DLL {
    class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data=data;
            this.prev=this.next=null;
        }
    }
    Node head;
    void insertAtBegin(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
            temp.next=newNode;
            newNode.prev=temp;
    }

    void deleteNode(int key){
        if(head==null) return;
        Node temp=head;
        while(temp!=null && temp.data!=key){
            temp=temp.next;
        }
        if(temp==null) return;
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp==head){
            head=temp.next;
        }
    }
    void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void printBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public  static void main(String args[]){
        DLL list=new DLL();
        list.insertAtBegin(2);
        list.insertAtBegin(6);
        list.insertAtBegin(4);
        list.printForward();
        list.insertAtEnd(0);
        list.printForward();
        list.deleteNode(6);
        list.printForward();
        list.printBackward();

    }

}

