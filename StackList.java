public class StackList {
   private StackNode top;
   private int count;

   public StackList() {
      top = null;
      count = 0;
   }

   private boolean isEmpty() {
      return count == 0;  // Returns true if the stack is empty
   }

   // Push method
   public boolean push(String data) {
      StackNode node = new StackNode(data); // Create a new node with the provided data
      node.tail = top; // New node's tail points to the current top node
      top = node; // The new node becomes the top node
      count++; // Increment count
      return true;
   }

   // Pop method
   public String pop() {
      if (!isEmpty()) {
         String poppedData = top.data; // Get the data of the node that is about to be popped
         top = top.tail; // Move top to the next node in the stack
         count--; // Decrement count
         return poppedData; // Return the popped data
      }
      return null; // Return null if the stack is empty
   }

   // Peek method
   public String peek() {
      if (!isEmpty()) {
         return top.data; // Return the data of the top node
      }
      return null; // Return null if the stack is empty
   }

   // Method to get the count of elements in the stack
   public int getcount() {
      return count;
   }

   // Display method
   public void display() {
      if (!isEmpty()) {
         StackNode temporary = top; // Start from the top node
         while (temporary != null) {
            System.out.println(temporary.data); // Print the data of the current node
            temporary = temporary.tail; // Move to the next node
         }
         System.out.println(); // Print a newline after displaying the stack
      } else {
         System.out.println("Stack is empty...."); // Inform the user if the stack is empty
      }
   }

   // Inner class for StackNode
   public class StackNode {
      String data;
      StackNode tail;

      public StackNode(String data) {
         this.data = data; // Set the node's data
         this.tail = null; // The next node is initially null
      }
   }
}
