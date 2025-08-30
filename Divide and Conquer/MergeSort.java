// public class MergeSort {

//     public static void MergeSortAlgo(int arr[], int si, int mid, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = si + (ei - si)/2;

//         MergeSortAlgo(arr, si, mid);
//         MergeSortAlgo(arr, mid + 1, ei);
//         merge(arr, si, mid, ei);
//     }
//     public static void merge (int arr[], int si, int mid, int ei) {

//         int temp [] = new int [ei - si+1];
//         int i = si;
//         int j = mid+1;
//         int k = 0;

//         while(i <= mid && j<= ei){
//             if (arr[i] < arr[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         // for the leftover elements of the first sorted part
//         while(i <= mid) {
//             temp [k++] = arr[i++];
//         }
//         // for the leftover elements of the second sorted part
//         while(i <= mid) {
//             temp [k++] = arr[i++];
//         }
//         while(j <= ei) {
//             temp [k++] = arr[j++];
//         }
//         for (k=0, i=si; k<temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }
//     public static void main (String agrs []) {
//         int arr[] = {2, 4, 1, 6 ,7, 9, 3};
//         MergeSortAlgo(arr, 0, arr.length - 1);
//     }
    
// }

public class MergeSort {

    // Recursive function to divide the array and sort
    public static void MergeSortAlgo(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Recursive calls to sort first and second halves
        MergeSortAlgo(arr, si, mid);
        MergeSortAlgo(arr, mid + 1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    // Function to merge two sorted parts of the array
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;      // pointer for left part
        int j = mid + 1; // pointer for right part
        int k = 0;       // pointer for temp array

        // Merge the two sorted parts into temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half (if any)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements from temp[] back to original array
        for (int m = 0; m < temp.length; m++) {
            arr[si + m] = temp[m];
        }
    }

    // Main function to test
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 6, 7, 9, 3};

        System.out.println("Original array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        MergeSortAlgo(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
