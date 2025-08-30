public class TilingProblem {

    public static int placeTiles (int n) {

        if (n == 0 || n == 1 ) {
            return 1;
        }

        int fnm1 = placeTiles(n -1);
        int fnm2 = placeTiles(n - 2);
        int total = fnm1 + fnm2;
        return  total;
    }

    public static void main (String args []) {

        System.out.println(placeTiles(3));
    }
    
}
