public class ClearIthBit {

    public static int ClearBit (int n, int i) {
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    public static void main (String agrs []) {
        System.out.println(ClearBit(10, 1));

    }
    
}
