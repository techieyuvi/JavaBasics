import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean isPrimeNumber(int num){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        n = input.nextInt();

        if (isPrimeNumber(n)){
            System.out.println("The number is prime number");
        }else {
            System.out.println("The number is not a prime number");
        }
    }
}
