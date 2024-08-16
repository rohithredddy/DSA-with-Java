class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListDemo {
    private Node head;

    // Method to insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to delete a node from the beginning of the list
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Method to delete a node from the end of the list
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();

        // Inserting elements at the end of the linked list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // Display the list
        System.out.println("Linked List after inserting at the end:");
        list.display();

        // Inserting elements at the beginning of the linked list
        list.insertAtBeginning(5);
        list.insertAtBeginning(1);

        // Display the list
        System.out.println("Linked List after inserting at the beginning:");
        list.display();

        // Deleting elements from the beginning of the list
        list.deleteFromBeginning();
        System.out.println("Linked List after deleting from the beginning:");
        list.display();

        // Deleting elements from the end of the list
        list.deleteFromEnd();
        System.out.println("Linked List after deleting from the end:");
        list.display();
    }
}
