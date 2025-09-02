public class binarySearch {

    public static int binarySearching(int array[], int key) {
        int start = 0, end = array.length - 1; 

        while(start <= end){
            int mid = (start + end)/ 2;
            
            if (array[mid] == key ) {
                return mid;
            }
            if (array[mid] < key){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 6;

        System.out.println("index for key is : " +binarySearching(array, key));
    }
}