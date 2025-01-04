
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        String[] arr;      /* new String[2]; >>> you can add this but this makes
         this initialized array redundant */

        Scanner sc = new Scanner(System.in);

        // Creating a continuous user interaction using while loop
        // and also checking the validness of inputs.

        while (true) {

            System.out.println("Enter the words you want to check:");
            String receivedInput = sc.nextLine();
            arr = receivedInput.split(" ");  //splitting the received input to validate

            if (arr.length == 2) {    // check the validity
                break;
            } else {
                System.out.println("Input invalid, enter only 2 words");
            }

        }

      /*  if (arr[0].equals(arr[1])) {
            System.out.println("both the words are same");
        } else {
            System.out.println("are not same");
        } */

        if(areAnagrams(arr[0], arr[1])){
            System.out.println("The given words are anagram");
        }else {
            System.out.println("The given words are not anagram");
        }
    }

    public static boolean areAnagrams(String word1, String word2){

        if(word1.length() != word2.length()){
            System.out.println("Words are not of same length");
            return false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word1.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);

    }
}


