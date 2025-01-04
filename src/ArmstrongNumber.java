import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean toFindArmstrong(int number){
        int originalNum = number;    // saving the original number to compare
        int sum = 0;                 // initializing the sum to zero
        int numDigits = String.valueOf(number).length();     // getting the total number of digits in the input

        while(number != 0){          // checking if its armstrong or not.
            int digit = number % 10;
            sum += Math.pow(digit,numDigits);
            number /= 10;
        }
        return sum == originalNum;  // comparing the checked number with Original num.
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.close();          //closing the scanner obj

        toFindArmstrong(num);   //calling the method

        if(toFindArmstrong(num)){
            System.out.println("The given number is Armstrong number");
        }else {
            System.out.println("The given number is not a Armstrong number");
        }
    }
}
