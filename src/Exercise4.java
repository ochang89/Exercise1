import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();
        int sum = 0;
        int digit = 0;
        int num = n;

        // Check if negative, return same value but positive
        if(n < 0) {
            num = (Math.abs(n));
        }

        // Find and print sum of all digits in integer n
        while(num > 0){
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println(String.format("The sum of all digits of %d is: ", n) + sum);

    }
}
