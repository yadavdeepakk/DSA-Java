public class printIncNums {

    public static void printNums (int num) {

        if(num == 10) {
            System.out.println(10);
            return;
        }
        System.out.println(num);
        printNums(num + 1); 
    }
    public static void main (String args []) {
        int num = 1;
        printNums(num);
    }
    
}
