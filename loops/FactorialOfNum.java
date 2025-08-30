import java.util.*;

public class FactorialOfNum {


    public static void CalcFactorial () {
        int num = 7;
        int f = 1;

        for (int i = 1; i <=7; i++) {
            f = f * i;
        }
        System.out.println(f);
    }    
    
    public static void main (String args []) {
        CalcFactorial();

    }
    
}
