//Given a sorted array of distinct elements arr[] of size n that is rotated at some unknown point, the task is to find the minimum element in it.
//
//        Examples:
//
//Input: arr[] = [5, 6, 1, 2, 3, 4]
//Output: 1
//Explanation: 1 is the minimum element present in the array.
//
//Input: arr[] = [3, 1, 2]
//Output: 1
//Explanation: 1 is the minimum element present in the array.
//
//Input: arr[] = [4, 2, 3]
//Output: 2
//Explanation: 2 is the only minimum element in the array.

//NOTE : USE BINARY SEARCH FOR O(log n) TIME COMPLEXITY


public class MinimumOfSortedRotatedArray {

    public int minOfArray(int [] arr){

        int low = 0;
        int high = arr.length - 1;

        while (low < high){

            int mid = (low + (high - low))/2;

            if (arr[mid] > arr[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {

        int[] arr = {6,5,1,2,3,4};

        MinimumOfSortedRotatedArray min = new MinimumOfSortedRotatedArray();

        System.out.println(min.minOfArray(arr));
    }
}
