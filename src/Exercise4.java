import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();
        int sum = 0;
        int digit = 0;
        // Store n into num. This is to keep n intact, so that we can print it in our string later.
        int num = n;

        // Check if negative, return same value but positive
        if(n < 0) {
            num = (Math.abs(n));
        }

        // Find and print sum of all digits in integer n
        while(num > 0){
            // If num is 14, 14 % 10 = 4. This would represent the last digit of the number n.
            digit = num % 10;
            // We take num which is 4, and add it to sum (which is 0 initially). sum will store the total of all digits
            sum += digit;

            // num / 10 will turn 14 into 1.4 and return the whole integer 1. Division only returns whole integers, not decimals.
            // We turn num into a decimal (1.4) and chop off the .4 by using the division's ability to round off the integer.
            // We are left with the remaining digit(s) which are stored into num
            num = num / 10;

            // num will store 1, which is the remaining digit of n (originally 14)
            System.out.println(num);
        }
        System.out.println(String.format("The sum of all digits of %d is: ", n) + sum);

    }
}
