public class sqrOfnum {

    public static int squareOfNum (int x, int n) {

        if ( n == 0) {
            return 1;
        }
        return x * squareOfNum(x, n-1);
    }
    public static void main (String args []) {
        System.out.println(squareOfNum(2, 10));
    }
    
}
