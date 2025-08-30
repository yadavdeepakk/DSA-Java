public class FactorialOfNum {

    public static int CalcFact(int num) {

        if (num == 0) {
            return 1;
        }
        int fnm1 = CalcFact(num - 1);
        int fn = num * CalcFact(num - 1);
        return fn;
    }
    public static void main (String args []) {
        int num = 5;
        System.out.println(CalcFact(num));
    }
    
}
