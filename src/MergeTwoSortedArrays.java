import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] Merge2Arrays(int[] arr1, int[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int a1 = arr1.length;
        int a2 = arr2.length;

        int c = a1+a2;

        int[] result = new int[c];

        System.arraycopy(arr1,0,result,0,a1);
        System.arraycopy(arr2,0,result,a1,a2);

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {3,4,7,3,5};
        int[] arr2 = {1,4,6,8,2};

        int[] resultArray = Merge2Arrays(arr1,arr2);

        System.out.println(Arrays.toString(resultArray));
    }
}
