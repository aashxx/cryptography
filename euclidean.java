import java.util.Scanner;

public class euclidean {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = input.nextInt();
        System.out.println("Enter second number:");
        int n2 = input.nextInt();

        // If n2 is greater, SWAP
        if(n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        // Remainder variable
        int rem;

        do {
            // Mod operation
            rem = n1 % n2;
            // Shift n2 to n1
            n1 = n2;
            if(rem == 0) {
                // gcd is n2
                int gcd = n2;
                System.out.println("GCD:"+ gcd);
            }
            // Shift remainder to n2
            n2 = rem;
            
        } while (rem != 0);

        input.close();
    }
}