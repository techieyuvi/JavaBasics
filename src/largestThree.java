import java.util.ArrayList;
import java.util.List;

public class largestThree {

    public static List<Integer> getLargestThree(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int x : arr){
            if (x > first) {
                third = second;
                second = first;
                first = x;
            } else if (x > second && x != first) {
                third = second;
                second = x;
            } else if (x > third && x != second && x != first) {
                third = x;
            }
        }

        List<Integer> result = new ArrayList<>();

        if (first == Integer.MIN_VALUE)
            return result;

        result.add(first);

        if (second == Integer.MIN_VALUE)
            return result;

        result.add(second);

        if (third == Integer.MIN_VALUE)
            return result;

        result.add(third);

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {12, 13, 1, 10, 34, 1};

        List<Integer> result = getLargestThree(arr);

        for (int i : result) {
            System.out.print(i + " ");
            System.out.println();
        }
    }
}
