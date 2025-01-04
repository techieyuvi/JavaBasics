import java.util.Scanner;

public class ReversingWord{

    public static void main(String[] args) {
        String word;
        String reversedWord ="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        word = sc.nextLine();

        String[] arr = word.split(" ");

        for (int i = arr.length - 1;i >= 0;i--) {
            reversedWord +=  arr[i] + " ";
        }
        System.out.println(reversedWord);
    }
}