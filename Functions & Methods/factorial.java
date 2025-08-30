public class factorial {

    int n = 7;
    int r = 5;
    int result = 1;

    public static int calcFactorial (int n, int r) {
        for ( int i = 1; i <=n; i++){
          result = i * result;
        }
        System.out.println(result);
        return result;
    }
    public static void main (String[] args){
        calcFactorial(n, r);
        int p = n-r;
       System.out.println("Binomial coefficient is : " + calcFactorial(n));

    }
}