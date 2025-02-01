import java.util.HashMap;
import java.util.HashSet;

public class TwoSumUsingHashmap {

    static boolean twoSum(int[] arr, int target) {

        HashSet<Integer> hashMap = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (hashMap.contains(complement)) {
                return true;
            }

            hashMap.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15};
        int target = 9;

        System.out.println(twoSum(array,target));
    }
}
