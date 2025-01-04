
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        String[] arr;      /* new String[2]; >>> you can add this but this makes
         this initialized array redundant */

        Scanner sc = new Scanner(System.in);

        while (true) {     // Creating a continuous user interaction using while loop
            // and also checking the validness of inputs.

            System.out.println("Enter the words you want to check:");
            String receivedInput = sc.nextLine();
            arr = receivedInput.split(" ");  //splitting the received input to validate

            if (arr.length == 2) {    // check the validity
                break;
            } else {
                System.out.println("Input invalid, enter only 2 words");
            }

        }

        // calling the areAnagram method to verify if the anagram

        if(areAnagrams(arr[0], arr[1])){
            System.out.println("The given words are anagram");
        }else {
            System.out.println("The given words are not anagram");
        }
    }

    public static boolean areAnagrams(String word1, String word2){  //to check the words if they are anagram

        if(word1.length() != word2.length()){     // execution breaks here if the inputs are invalid
            System.out.println("Words are not of same length");
            return false;
        }

        char[] charArray1 = word1.toCharArray();    //valid inputs are converted into character array
        char[] charArray2 = word1.toCharArray();

        Arrays.sort(charArray1); // sorting each character arrays of the element
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2); // returns if they are same

    }
}


