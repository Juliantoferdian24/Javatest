package linkedlist;

// Java program to delete a linked list
class LinkedList3 {
    static Node head; // head of the list

    /* Linked List node */
    class Node
    {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    /* Function deletes the entire linked list */
    void deleteList()
    {
        head = null;
    }

    public static void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String [] args)
    {
        LinkedList3 llist = new LinkedList3();
		/* Use push() to construct below list
		1->12->1->4->1 */

        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);

        printList();
        llist.deleteList();
        printList();
    }
}
// This code is contributed by Rajat Mishra

