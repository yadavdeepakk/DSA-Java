import java.util.*;

public class CheckPrimeNum {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        boolean isPrime = true; 

        if (num <= 1) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Entered Number is a Prime Number");
        } else {
            System.out.println("Entered Number is Not a Prime Number");
        }
    }
}
