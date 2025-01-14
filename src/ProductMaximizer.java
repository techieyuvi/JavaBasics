import java.util.Scanner;

public class ProductMaximizer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = input.nextInt();
        int[] arr = new int[n];                         //Creating an array with user input which is n

        if(n < 2){
            System.out.println("Array should have at least 2 numbers.");
            return;
        }

        System.out.println("Enter the elements:");      //inserting all the numbers in array that user enters
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();


        int max1 = Integer.MIN_VALUE ; int max2 = Integer.MIN_VALUE;        //setting the max1 to ,smallest values so that we can sort it easily
        int min1 = Integer.MAX_VALUE ; int min2 = Integer.MAX_VALUE;        //setting the min1 to ,largest value so that we can sort it easily

        for(int num : arr){                 // going through all the numbers in array
            if( num > max1){                //checking if num is greater than max1 , if true set max1 as num and transfer the
                max2 = max1;                //current value of max1 to max2
                max1 = num;
            }else if ( num < max2){         //else set the max2 to num and max1 the same
                max2 = num;
            }

            if( num < min1){                //same as max method....
                min2 = min1;
                min1 = num;
            }else if ( num < min2){
                min2 = num;
            }
        }

        int product1 = max1 * max2;             //checking which is the max num.
        int product2 = min1 * min2;

        if (product1 > product2){
            System.out.println(max1);
            System.out.println(max2);
        } else {
            System.out.println(min1);
            System.out.println(min2);
        }
    }
}
