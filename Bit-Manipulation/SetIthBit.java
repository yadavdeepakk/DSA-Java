public class SetIthBit {

    public static int SetBit (int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    } 

    public static void main (String args []) {
        
        System.out.println (SetBit(10, 2));
    }
    
}
