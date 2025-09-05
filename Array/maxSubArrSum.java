public class maxSubArrSum {

    // ***************[ Brute force ]********************
    public static void subArrSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    // ***************[ Prefix Sum ]********************
    public static void subArrSum2(int arr []) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int prefix [] = new int [arr.length];

        prefix [0] = arr [0];
        for (int i = 1; i < prefix.length; i++){
            prefix [i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < n; i++){
           int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    // Kadane's algo
    public static void KadanesAlgo (int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0; i<arr.length; i++){
            cs = cs + arr[i];
            if( cs < 0 ){
                cs = 0;
            } 
            ms = Math.max (cs, ms);
        }
        System.out.println("Our maximum subarray sum is : " + ms);

    }

    public static void main (String[] args) {
        int arr [] = { 4, -3, -2, -1, -2, 1, -3, 5, 6};
        subArrSum2(arr);
        KadanesAlgo(arr);
        subArrSum(arr);
    }
}