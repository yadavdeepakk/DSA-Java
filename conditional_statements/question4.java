import java.util.Scanner;

public class question4 {

    public static void main (String [] args) {
        
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int final_num = 0;

        for(int i=1; i<=10; i++){
            final_num = N * i; 
            System.out.println(final_num);           
        }
        
        scn.close();
    }
    
}
