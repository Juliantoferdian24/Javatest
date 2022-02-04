package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList2 {
    Node head;

    void printMiddle() {
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        System.out.println("Middle element : " + slowPtr.data);
    }

    /* Inserts a new Node at front of the list. */
    public void insertAtHead(int new_data) {
        if (head == null) {
            head = new Node(new_data);
        } else {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }
    }

    public void insertAtEnd(int new_data) {
        if (head == null) {
            head = new Node(new_data);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(new_data);
        }
    }

    public void deleteNodeWithValue(int key) {
        Node temp = head;
        Node prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void deleteNodeWithPosition(int position) {
        // If linked list is empty
        if (head == null)
            return;
        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list
    }

    public void deleteList() {
        head = null;
    }

    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int getNodeAtPosition(int position){
        Node temp = head;
        int count = 0;
        int result = 0;
        while (temp != null) {
            if(count == position) {
                result = temp.data;
                break;
            }
            count++;
            temp = temp.next;
        }
        return result;
    }

    public boolean isInList(int input) {
        Node temp = head;
        while (temp != null){
            if(temp.data == input) return true;
            temp = temp.next;
        }
        return false;
    }

    public Node removeDuplicatesFromSortedList() {
        Node temp = head;
        while(temp != null && temp.next != null) {
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public void removeDuplicateFromUnsortedList(){
        Node current = head;
        Node prev = null;

        HashSet<Integer> hs = new HashSet<>();

        while (current!= null){
            int curval = current.data;
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    public static Node findIntersectionOfTwoLinkedList(Node nodeA, Node nodeB){
        if(nodeA == null || nodeB == null) return null;
        Set<Node> nodeSet = new HashSet<>();

        Node tempA = nodeA;
        while (tempA != null){
            nodeSet.add(tempA);
            tempA = tempA.next;
        }

        Node tempB = nodeB;
        while (tempB != null){
            if(nodeSet.contains(tempB)){
                return tempB;
            }
            tempB = tempB.next;
        }
        return null;
    }

    public void swap(int n1, int n2) {
        Node prevNode1 = null, prevNode2 = null,
                node1 = head, node2 = head;
        // Checks if list is empty
        if (head == null) {
            return;
        }
        // If n1 and n2 are equal, then list will remain the same
        if (n1 == n2)
            return;

        // Search for node1
        while (node1 != null && node1.data != n1) {
            prevNode1 = node1;
            node1 = node1.next;
        }
        // Search for node2
        while (node2 != null && node2.data != n2) {
            prevNode2 = node2;
            node2 = node2.next;
        }

        if (node1 != null && node2 != null) {

            // If previous node to node1 is not null then, it will point to node2
            if (prevNode1 != null)
                prevNode1.next = node2;
            else
                head = node2;

            // If previous node to node2 is not null then,
            // it will point to node1
            if (prevNode2 != null)
                prevNode2.next = node1;
            else
                head = node1;

            // Swaps the next nodes of node1 and node2
            Node temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        }
        else {
            System.out.println("Swapping is not possible");
        }
    }

    public void moveToFront()
    {
        /* If linked list is empty or it contains only
           one node then simply return. */
        if(head == null || head.next == null)
            return;

        /* Initialize second last and last pointers */
        Node secLast = null;
        Node last = head;

        /* After this loop secLast contains address of
           second last  node and last contains address of
           last node in Linked List */
        while (last.next != null)
        {
            secLast = last;
            last = last.next;
        }

        /* Set the next of second last as null */
        secLast.next = null;

        /* Set the next of last as head */
        last.next = head;

        /* Change head to point to last node. */
        head = last;
    }

    public boolean detectLoop()
    {
        Node h = head;
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
        return false;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList2 llist1 = new LinkedList2();
        llist1.insertAtHead(20);
        llist1.insertAtHead(4);
        llist1.insertAtHead(15);
        llist1.insertAtHead(10);

        LinkedList2 llist2 = new LinkedList2();
        llist2.insertAtEnd(3);
        llist2.insertAtEnd(3);
        llist2.insertAtEnd(4);
        llist2.insertAtEnd(5);

        llist1.printList();
        System.out.println("------");
        llist1.reverse();
        llist1.printList();
    }
}
