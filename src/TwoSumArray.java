import java.util.HashMap;

public class TwoSumArray {

    public static int[] sumPairs(int[] arr, int n){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = n - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums= {2,7,11,15};
        int target = 18;

        int[] result = TwoSumArray.sumPairs(nums,target);

        if(result.length == 2){
            System.out.println("The two numbers are " + nums[result[0]] + " and " + nums[result[1]]);
        }else {
            System.out.println("There are no such numbers");
        }
    }
}
