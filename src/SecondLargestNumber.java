

public class SecondLargestNumber{


    public static int findSecondLargest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = { 5,17,2,6,24,38,3,13};

        System.out.println(findSecondLargest(arr));
    }
}