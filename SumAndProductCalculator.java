import java.util.Scanner;

class SumAndProductCalculator {

    public void calculateSumAndProduct(Scanner scanner) {
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
                    
                    // Only process positive numbers
                    if (num > 0) {
                        sum += num;
                        product *= num;
                        count++;
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }

        // Print the sum and product if positive numbers were entered
        if (count > 0) {
            System.out.println("Total sum of numbers greater than 0: " + sum);
            System.out.println("Total product of numbers greater than 0: " + product);
        } else {
            System.out.println("No positive numbers were entered.");
        }
    }
}
