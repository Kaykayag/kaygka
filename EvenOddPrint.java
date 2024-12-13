import java.util.Scanner;

public class EvenOddPrint {

    public static void printEvenOddNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] evenNums = new int[10];
        int[] oddNums = new int[10];
        int evenCount = 0;
        int oddCount = 0;
        int maxNum, num;

        System.out.println("Enter 10 integers:");

        // Get the input numbers
        for (int i = 0; i < 10; i++) { 
            num = scan.nextInt();
            
            if (num % 2 == 0) 
                evenNums[evenCount++] = num; 
            else 
                oddNums[oddCount++] = num;
        }

        // Output the even and odd numbers
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
    }
}
