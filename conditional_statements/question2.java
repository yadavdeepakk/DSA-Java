import java.util.Scanner;
public class question2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println("leap Year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
