class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class StackNode {
    private Node last;
    private int count;

    public StackNode() {
        last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // Add a new node to the stack (Push)
    public void add(Node item) {
        if (last == null) {
            last = item;
            last.next = last; // Points to itself to form a circular list
        } else {
            item.next = last.next;
            last.next = item;  // Insert the new node after the last one
            last = item;  // Update 'last' to the new node
        }
        count++;
    }

    // Pop a node from the stack
    public Node delete() {
        if (isEmpty()) {
            return null;  // No element to pop
        }

        Node temp = last.next;  // The top element of the stack (first element in the list)
        if (last == last.next) {  // If there's only one element in the stack
            last = null;  // The stack is now empty
        } else {
            last.next = temp.next;  // Remove the top element
        }
        count--;
        return temp;
    }

  
    public String peek() {
        if (isEmpty()) {
            return "Stack is empty.";
        }
        return last.next.data; 
    }

 
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = last.next;
        while (current != last) {
            System.out.print("[" + current.data + "] -> ");
            current = current.next;
        }
        System.out.println("[" + current.data + "] -> null");
    }
}
