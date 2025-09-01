import java.util.*;

public class largestInArray {

    public static int findLargest(int arr[]){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if( large < arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main (String[] args) {
        int arr[] = {1, 4, 6, 23,9, 3, 85};
        System.out.println("Largest value in the given array is : "+ findLargest(arr));
    }
}