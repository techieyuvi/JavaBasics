public class FindArrayIsRotated {

    static int isRotated(int[] arr) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1)%n]) {
                count++;
            }
            if (count > 0) {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        int rotationCount = isRotated(arr);
        if (rotationCount == 0) {
            System.out.println("The Array is not rotated");
        } else {
            System.out.println("The Array is rotated " + rotationCount + " times");
        }
    }
}
