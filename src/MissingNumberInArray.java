public class MissingNumberInArray {

    static int getMissingNumber(int [] arr){

        int length = arr.length + 1;

        int sum = 0;
        for (int i = 0; i < length - 1; i++) {
            sum += arr[i];
        }

        int expectedSum = length*(length+1)/2;      // n(n+1)/2 >> sum of natural numbers

    return expectedSum - sum;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,8};

        System.out.println(getMissingNumber(arr));
    }
}


