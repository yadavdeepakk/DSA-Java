public class question5 {

    public static void main (String [] args){
         int num = 12;

         for (int i = 2; i<= num - 1; i++) {
            if( num % i == 0 ){
                System.out.println("not a prime number");
            } else {
                System.out.println("prime number");
            }
         }
    }    
}
