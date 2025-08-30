import java.util.Scanner;

public class question3 {

    public static void main (String [] args) {

        Scanner scn = new Scanner(System.in);
        int value = 1;
        int num = scn.nextInt();

        for ( int i = 1; i<= num; i++) {
            value = value * i;
        }
        System.out.println(value);
        scn.close();
    }    
}
