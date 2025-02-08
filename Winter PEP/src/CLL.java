public class CLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node last;
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }
    void deleteNode(int key) {
        if (last == null) return;
        Node temp = last, prev = null;
        do {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                if (last.next == temp.next) // If only one node left
                    last = null;
                return;
            }
            temp = temp.next;
        } while (temp != last);
    }

    void printList() {
        if (last == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println("... (Circular)");
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.printList();
        cll.deleteNode(20);
        cll.printList();
    }

}
