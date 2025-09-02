public class subarray {

    public static void printSubArray (int arr []) {

        int n = arr.length;
        int totalSubArray = 0;
        for (int i=0; i<n; i++) {
            int start = i;
            for (int j = i; j<n; j++) {
                int end = j;
                for (int k = start; k<end; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
                totalSubArray++;
            }
        }
        System.out.println("total sub Arrays are : " + totalSubArray);
    }

    public static void main( String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        printSubArray(arr);
    }
}