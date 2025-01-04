
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        String[] arr;      /* new String[2]; */
        String letters;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the words you want to check:");
            String receivedInput = sc.nextLine();
            arr = receivedInput.split(" ");

            if (arr.length == 2) {
                break;
            } else {
                System.out.println("Input invalid, enter only 2 words");
            }

        }

        if (arr[0] == arr[1]) {
            System.out.println("both the words are same");
        } else {
            System.out.println("are not same");
        }

        if(areAnagrams(arr[0], arr[1])){
            System.out.println("The given words are anagram");
        }else {
            System.out.println("The given words are not anagram");
        }
    }

    public static boolean areAnagrams(String word1, String word2){

        if(word1.length() != word2.length()){
            return false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word1.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}


