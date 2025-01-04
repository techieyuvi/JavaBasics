import java.util.Scanner;



public class ArmstrongNumber {

    public static boolean tofindArmstrong(int number){
        int originalNum = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while(number != 0){
            int digit = number % 10;
            sum += Math.pow(digit,numDigits);
            number /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        input.close();

        tofindArmstrong(num);

        if(tofindArmstrong(num)){
            System.out.println("The given number is Armstrong number");
        }else {
            System.out.println("The given number is not a Armstrong number");
        }
    }
}
