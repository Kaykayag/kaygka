class Node {
    String data;
    Node next;

    // Constructor
    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class NodeList {
    private Node last;
    private int counter;

    public NodeList() {
        this.last = null;
        this.counter = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public boolean add(Node item) {
        if (last == null) {
            last = item;
            last.next = last;  // Points to itself, circular list
        } else {
            Node current = last;
            while (current.next != last) { 
                current = current.next;
            }
            current.next = item;
            item.next = last;  // Circular link back to last
        }

        counter++;
        return true;
    }

    public boolean delete(int location) {
        if (location < 0 || location >= counter) {
            System.out.println("Invalid location: " + location);
            return false;
        }

        if (location == 0) {  // Deleting the first node
            if (counter == 1) {
                last = null;  // List becomes empty
            } else {
                Node current = last;
                while (current.next != last) { 
                    current = current.next;
                }
                current.next = last.next; 
                last = current; // Update the last pointer
            }
        } else {
            Node current = last;
            for (int i = 0; i < location - 1; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
                // If the node being deleted is the last one, update the last pointer
                if (current.next == last) {
                    last = current;
                }
            }
        }

        counter--;
        return true;
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = last.next;  // Start from the first node
        do {
            System.out.print("[" + current.data + "] -> ");
            current = current.next;
        } while (current != last.next);  // Stop when we reach the first node again
        System.out.println("null");
    }
}
