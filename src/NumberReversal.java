import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        num = input.nextInt();
        input.close();

        String intToString = Integer.toString(num);

        int[] digits = new int[intToString.length()];
        int[] reversedDigits = new int[intToString.length()];

        for (int i = 0; i < intToString.length(); i++) {
             digits[i] = Character.getNumericValue(intToString.charAt(i));
        }

        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }

        StringBuilder reversedString = new StringBuilder();
        for(int digit : reversedDigits){
            reversedString.append(digit);
        }

        int reversedNum = Integer.parseInt(reversedString.toString());

        System.out.println(reversedNum);
    }
}
