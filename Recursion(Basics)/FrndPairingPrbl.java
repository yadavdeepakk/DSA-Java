public class FrndPairingPrbl {

    public static int frndPairing (int n) {

        if ( n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = frndPairing( n - 1);
        int fnm2 = (n-1) * frndPairing( n - 2);

        int totalWays =fnm1 + fnm2;
        return totalWays;
    }
    public static void main (String args []) {
        int n = 3;
        System.out.println(frndPairing(n));   
    }    
}
