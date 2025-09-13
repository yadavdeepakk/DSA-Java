public class arrSum {

    public static int printArrSum(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + printArrSum(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = printArrSum(arr, arr.length);
        System.out.println("Sum of array = " + sum);
    }
}
