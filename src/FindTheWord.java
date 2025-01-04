import java.util.Scanner;

public class FindTheWord {
    public static void main(String[] args) {

        String word;
        int pos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sentence:");
        word = sc.nextLine();

        System.out.println(word);

        String[] arr = word.split(" ");

        while (true) {
            System.out.println("Enter the position of the word you want to retrieve");
            pos = sc.nextInt();
            if(pos >= 0 && pos <= arr.length) {
                System.out.println(arr[pos]);
                break;
            }else{
                System.out.println("Invalid number, Enter a number between 0 and " + (arr.length - 1));
            }
        }
    }
}
