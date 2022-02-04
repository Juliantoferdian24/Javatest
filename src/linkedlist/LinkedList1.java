package linkedlist;

public class LinkedList1 {
    private Node head;

    public LinkedList1() {
        this.head = null;
    }

    public Node insertAtHead(int data){
        if(head == null){
            head = new Node(data);
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
        return head;
    }

    public void deleteNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.insertAtHead(4);
        ll.insertAtHead(5);
        ll.insertAtHead(6);
        ll.insertAtHead(7);
        ll.deleteNode(ll.head);
        ll.print();
    }
}
