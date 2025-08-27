import java.util.Scanner;

public class question1 {
    public static void main (String [] args) {
        Scanner scn = new Scanner (System.in);
         int num = scn.nextInt();

         if (num % 2 == 0) {
            System.out.println("Even Number");}
            else {
                System.out.println("odd number"); }
                scn.close();
            }

    }