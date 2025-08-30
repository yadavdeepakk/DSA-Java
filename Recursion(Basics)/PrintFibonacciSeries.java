public class PrintFibonacciSeries {

    public static int fnSr (int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        int fnm1 = fnSr(num - 1);
        int fnm2 = fnSr(num - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main (String agrs []) {
        int num = 25;
        System.out.println(fnSr(num));
    }

}