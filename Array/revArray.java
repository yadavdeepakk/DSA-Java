public class revArray {

    public static void reverseArr(int arr[]) {
        int start = 0, last = arr.length - 1;
        
        while(start < last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;

            start++;
            last--;
        }
    }
     public static void main (String[] args) {
        int arr[] = {2, 4, 6, 8 ,10};
        reverseArr(arr);

        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
     }
}