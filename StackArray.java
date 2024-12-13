public class StackArray {
    private int maxSize;
    private int top;
    private int[] stack;

    public StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println(value);
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return stack[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        stack.display();
        
        System.out.println(stack.peek());
        
        stack.pop();
        stack.pop();
        
        stack.display();
        
        System.out.println(stack.peek());
    }
}
