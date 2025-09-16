public class SumOfNums {

    public static int SumOfNaturalNums (int num) {

        if (num == 1) {
            return 1;
        }
        int fnm1 = SumOfNaturalNums(num - 1);
        int fn = SumOfNaturalNums(num - 1) + num;
        return fn;
    }

    public static void main (String args []) {
        int num = 10;
        System.out.println(SumOfNaturalNums(num));
    }
    
}
