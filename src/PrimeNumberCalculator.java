import java.util.Scanner;

public class PrimeNumberCalculator {

    public static boolean returnPrimeFactors(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n1; int n2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        n1 = input.nextInt();

        System.out.println("Enter the Second number:");
        n2 = input.nextInt();

        for (int i = n1; i <= n2; i++) {
            if(returnPrimeFactors(i)){
                System.out.println(i);
            }
        }
    }
}
