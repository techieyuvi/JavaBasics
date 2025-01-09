import java.util.Arrays;

public class ProductArrayExceptSelf {

        // Function to calculate the product of all
        // elements except the current element
        static int[] productExceptSelf(int[] arr) {
            int n = arr.length;

            // If only one element, return a vector with 1
            if (n == 1) {
                return new int[]{1};
            }

            int[] left = new int[n], right = new int[n], prod = new int[n];

            // Construct the left array
            left[0] = 1;
            for (int i = 1; i < n; i++) {
                left[i] = arr[i - 1] * left[i - 1];
            }

            // Construct the right array
            right[n - 1] = 1;
            for (int j = n - 2; j >= 0; j--) {
                right[j] = arr[j + 1] * right[j + 1];
            }

            // Construct the product array using left[] and right[]
            for (int i = 0; i < n; i++) {
                prod[i] = left[i] * right[i];
            }

            return prod;
        }

        public static void main(String[] args) {
            int[] arr = {10, 3, 5, 6, 2};
            int[] res = productExceptSelf(arr);

            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

