public class PrintDecNums {

    public static void printNum (int num) {
        if (num == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(num);
        printNum(num - 1);
    }
    public static void main (String args []) {
        int num = 10;
        printNum(num);
    }   
}
