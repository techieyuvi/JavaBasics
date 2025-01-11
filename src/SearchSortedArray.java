

public class SearchSortedArray {

    public static int findTheIndex(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {6, 5, 1, 2, 3, 4};
        int key = 3;

        int answer = SearchSortedArray.findTheIndex(arr, key);
        System.out.println(answer);

    }
}
