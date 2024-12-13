import java.util.Scanner;

public class CompileAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("________________________________");
            System.out.println("|  Welcome To Got-it-all Menu   |");
            System.out.println("|1. STACK ARRAY\t\t\t\t\t  |");
            System.out.println("|2. STACK NODE\t\t\t\t\t\t  |");
            System.out.println("|3. STACK LIST\t\t\t\t\t\t  |");
            System.out.println("|4. SUM AND PRODUCT \t\t\t\t  |");
            System.out.println("|5. EVEN AND ODD \t\t\t\t\t  |");
            System.out.println("|6. INFIX TO POSTFIX \t\t\t  |");
            System.out.println("|7. EVALUATION\t\t\t\t\t\t  |");
            System.out.println("|8. QUEUE ARRAY \t\t\t\t\t  |");
            System.out.println("|9. QUEUE NODE\t\t\t\t\t\t  |");
             System.out.println("|10.NODE LIST\t\t\t\t\t\t  |");
              System.out.println("|11.EXIT\t\t\t\t\t\t\t\t  |");
            System.out.println("________________________________");
            System.out.print("Enter your choice: ");

            int choice = -1;
           
            while (true) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 10) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 and 10.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }

            switch (choice) {

                // Case for STACK ARRAY
                case 1:
                    System.out.println("Welcome to STACK ARRAY!\nInput Size: ");
                    int size = scanner.nextInt();
                    StackArray stack = new StackArray(size);

                    while (true) {
                        System.out.println("1. PUSH AN ITEM");
                        System.out.println("2. POP AN ITEM");
                        System.out.println("3. TAKE A PEEK");
                        System.out.println("4. SEE DETAILS");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Enter your choice: ");
                        int pick1 = scanner.nextInt();

                        switch (pick1) {
                            case 1:
                                System.out.println("Push an item: ");
                                int item = scanner.nextInt();
                                stack.push(item);
                                System.out.println("Item pushed successfully.");
                                break;
                            case 2:
                                stack.pop();
                                System.out.println("Item popped successfully.");
                                break;
                            case 3:
                                System.out.println("Top item: " + stack.peek());
                                break;
                            case 4:
                                stack.display();
                                break;
                            case 5:
                                System.out.println("Returning to the main menu...");
                                break;  
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                        if (pick1 == 5) {
                            break; 
                        }
                    }
                    break;

                // Case for STACK NODE
                case 2:
                    System.out.println("Welcome to STACK NODE!");
                    StackNode stackNode = new StackNode();
                    while (true) {
                        System.out.println("1. PUSH AN ITEM");
                        System.out.println("2. POP AN ITEM");
                        System.out.println("3. TAKE A PEEK");
                        System.out.println("4. SEE DETAILS");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Enter your choice: ");
                        int pick2 = scanner.nextInt();

                        switch (pick2) {
                            case 1:
                                System.out.println("Push an item (String): ");
                                String itemData = scanner.next();
                                stackNode.add(new Node(itemData));
                                System.out.println("Item pushed successfully.");
                                break;
                            case 2:
                                stackNode.delete();
                                
                                break;
                            case 3:
                                System.out.println("Top item: " + stackNode.peek());
                                break;
                            case 4:
                                stackNode.display();
                                break;
                            case 5:
                                System.out.println("Returning to the main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                        if (pick2 == 5) {
                            break;
                        }
                    }
                    break;

                // Case for STACK LIST
                case 3:
                    System.out.println("Welcome to STACK LIST!");
                    StackList stackList = new StackList();
                    while (true) {
                        System.out.println("1. PUSH AN ITEM");
                        System.out.println("2. POP AN ITEM");
                        System.out.println("3. TAKE A PEEK");
                        System.out.println("4. SEE DETAILS");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Enter your choice: ");
                        int pick3 = scanner.nextInt();

                        switch (pick3) {
                            case 1:
                                System.out.println("Push an item (String): ");
                                String itemData = scanner.next();
                                stackList.push(itemData);
                                System.out.println("Item pushed successfully.");
                                break;
                            case 2:
                                stackList.pop();
                                break;
                            case 3:
                                System.out.println("Top item: " + stackList.peek());
                                break;
                            case 4:
                                stackList.display();
                                break;
                            case 5:
                                System.out.println("Returning to the main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                        if (pick3 == 5) {
                            break;
                        }
                    }
                    break;

                // Case for SUM AND PRODUCT
                case 4:
                    System.out.println("Welcome to SUM AND PRODUCT!");

                    int sum = 0;
                    long product = 1;
                    int count = 0;

                    System.out.println("Please enter 10 integers:");

                    // Loop to read 10 integers
                    for (int i = 1; i <= 10; i++) {
                        int num = 0;
                        boolean validInput = false;

                        while (!validInput) {
                            System.out.print("Enter integer " + i + ": ");
                            
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                validInput = true;
                                  
                               
                                if (num > 0) {
                                    sum += num;
                                    product *= num;
                                    count++;
                                }
                            } else {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                scanner.next(); 
                            }
                        }
                    }

                  
                    if (count > 0) {
                        System.out.println("Total sum of numbers greater than 0: " + sum);
                        System.out.println("Total product of numbers greater than 0: " + product);
                    } else {
                        System.out.println("No positive numbers were entered.");
                    }
                    break;

                // Case for EVEN AND ODD
                case 5:
                    System.out.println("Welcome to EVEN AND ODD!");
                    
                    int[] evenNums = new int[10];
                    int[] oddNums = new int[10];
                    int evenCount = 0;
                    int oddCount = 0;
                    int maxNum, num;

                    System.out.println("Enter 10 integers:");

                    for (int i = 0; i < 10; i++) { 
                        num = scanner.nextInt();
                        
                        if (num % 2 == 0) 
                            evenNums[evenCount++] = num; 
                        else 
                            oddNums[oddCount++] = num;
                    }

                   
                    System.out.println("Even\t\tOdd");

                    maxNum = Math.max(evenCount, oddCount);
                    
                    for (int i = 0; i < maxNum; i++) { 
                        if (i < evenCount) 
                            System.out.print(evenNums[i] + "\t\t");
                        else 
                            System.out.print("\t\t");

                        if (i < oddCount)  
                            System.out.println(oddNums[i]);
                        else  
                            System.out.println();
                    }
                    break;
                    // CASE FOR INFIX AND POSTFIX
                  case 6:
              
                    System.out.println("Welcome to INFIX TO POSTFIX!");
                    System.out.println("Please enter an infix expression:");

                    scanner.nextLine();
                    String infixExpression = scanner.nextLine();

                    
                    InfixToPostfix infixToPostfix = new InfixToPostfix(infixExpression);

                    
                    System.out.println("Postfix Expression: " + infixToPostfix.Conversion());
                    break;
                    
                    //CASE FOR EVALUATION
                    case 7:
                    System.out.println("Welcome to POSTFIX EVALUATION!");
                    System.out.println("Please enter a postfix expression (e.g., 32+):");

                    scanner.nextLine(); 
                    String postfixExpression = scanner.nextLine();

                   
                    Evaluation evaluation = new Evaluation(postfixExpression);

                   
                    System.out.println("Postfix Expression Result: " + evaluation.getResult());
                    break;
                    
                     //CASE FOR QUEUE ARRAY
                    case 8:
                    System.out.println("Welcome to QUEUE ARRAY!");
                    System.out.println("Enter the size of the queue:");
                    int size1 = scanner.nextInt();
                    QueueArray queue = new QueueArray(size1);

                    while (true) {
                        System.out.println("1. ENQUEUE");
                        System.out.println("2. DEQUEUE");
                        System.out.println("3. FRONT");
                        System.out.println("4. DISPLAY");
                        System.out.println("5. Go back to the main menu");
                        System.out.print("Enter your choice: ");
                        int pick9 = scanner.nextInt();

                        switch (pick9) {
                            case 1:
                                System.out.print("Enter a value to enqueue: ");
                                int val = scanner.nextInt();
                                if (queue.enqueue(val)) {
                                    System.out.println("Value enqueued successfully.");
                                } else {
                                    System.out.println("Queue is full. Cannot enqueue.");
                                }
                                break;
                            case 2:
                                if (queue.dequeue()) {
                                    System.out.println("Value dequeued successfully.");
                                } else {
                                    System.out.println("Queue is empty. Cannot dequeue.");
                                }
                                break;
                            case 3:
                                Object front = queue.front();
                                if (front != null) {
                                    System.out.println("Front of the queue: " + front);
                                } else {
                                    System.out.println("Queue is empty.");
                                }
                                break;
                            case 4:
                                queue.display();
                                break;
                            case 5:
                                System.out.println("Returning to the main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                        if (pick9 == 5) {
                            break; 
                        }
                    }
                    break;
                     //QUEUE NODE
                     case 9:
                    System.out.println("Welcome to QUEUE NODE!");
                    QueueNode queueNode = new QueueNode();

                    while (true) {
                        System.out.println("1. ENQUEUE");
                        System.out.println("2. DEQUEUE");
                        System.out.println("3. GET FIRST");
                        System.out.println("4. GET LAST");
                        System.out.println("5. DISPLAY");
                        System.out.println("6. Go back to the main menu");
                        System.out.print("Enter your choice: ");
                        int pick9 = scanner.nextInt();

                        switch (pick9) {
                            case 1:
                                System.out.print("Enter a value to enqueue: ");
                                int value = scanner.nextInt();
                                if (queueNode.enqueue(value)) {
                                    System.out.println("Value enqueued successfully.");
                                } else {
                                    System.out.println("Queue operation failed.");
                                }
                                break;
                            case 2:
                                if (queueNode.dequeue()) {
                                    System.out.println("Value dequeued successfully.");
                                } else {
                                    System.out.println("Queue is empty. Cannot dequeue.");
                                }
                                break;
                            case 3:
                                Object first = queueNode.getFirst();
                                if (first != null) {
                                    System.out.println("First element: " + first);
                                } else {
                                    System.out.println("Queue is empty.");
                                }
                                break;
                            case 4:
                                Object last = queueNode.getLast();
                                if (last != null) {
                                    System.out.println("Last element: " + last);
                                } else {
                                    System.out.println("Queue is empty.");
                                }
                                break;
                            case 5:
                                queueNode.display();
                                break;
                            case 6:
                                System.out.println("Returning to the main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                        if (pick9 == 6) {
                            break;
                        }
                    }
                    break;

                     case 10:
                   System.out.println("Welcome to NODE LIST!");
                     NodeList nodeList = new NodeList();
                         while (true) {
                        System.out.println("1. ADD AN ITEM");
                          System.out.println("2. DELETE AN ITEM");
                              System.out.println("3. DISPLAY");
                               System.out.println("4. Go back to the main menu");
                            System.out.print("Enter your choice: ");
                            int pick10 = scanner.nextInt();

                       switch (pick10) {
                             case 1:
                         System.out.println("Enter the data to add: ");
                            String data = scanner.next();
                           nodeList.add(new Node(data));
                               System.out.println("Item added successfully.");
                            break;
                        case 2:
                System.out.println("Enter the location to delete: ");
                int location = scanner.nextInt();
                if (nodeList.delete(location)) {
                    System.out.println("Item deleted successfully.");
                } else {
                    System.out.println("Item deletion failed.");
                }
                break;
            case 3:
                nodeList.display();
                break;
            case 4:
                System.out.println("Returning to the main menu...");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
        if (pick10 == 4) {
            break;
        }
    }
    break;


                     case 11:
                     System.out.println("Exiting...");
                     System.exit(0);
                     break;
                     
                      default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

           }
}
 