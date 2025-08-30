public class OddOrEven {


    public static void CheckOddOrEven ( int n) {
        int bitMask = 1;

        if(( n & bitMask) == 0 ) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main (String args []) {

        CheckOddOrEven(3);
        CheckOddOrEven(6);
    }
    
}
