public class SearchSortedArrayByBinarySearch {

    public static int binarySearch(int[] arr,int low,int high, int key) {

        low = 0;
        high = arr.length - 1;
        int middle = low + (high - low) / 2;

        if (low <= high) {
            if (arr[middle] == key) {
                return middle;
            }
            if (arr[middle] < key) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr,int low ,int high){

        while(low < high){

            if(arr[low] == arr[high]){
                return low;
            }
            int middle = low + (high + low)/2;

            if(arr[middle] > arr[high]){
                low = middle + 1;
            }else{
                high = middle;
            }
        }
        return low;
    }

    public static int searchArray(int[] arr,int key){

        int pivot = findPivot(arr,0,arr.length - 1);

        if(arr[pivot] == key){
            return pivot;
        }
        if(pivot == 0){
            return  binarySearch(arr,0,arr.length - 1,key);
        }
        if(arr[0] <= key){
            return binarySearch(arr,0,pivot - 1,key);
        }
        return binarySearch(arr,pivot,arr.length-1,key);
    }

    public static void main(String[] args) {

        int[] arr = {9,8,7,1,2,3,4,5,6};
        int key = 4;

        System.out.println(searchArray(arr, key));

    }
}
