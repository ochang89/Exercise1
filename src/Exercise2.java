import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer n: ");
        int n = input.nextInt();
        int count = 0;
        int sum = 0;

        while(count <= n) {
            // Find even numbers
            if(count % 2 == 0) {
                // Sum and print even numbers
                sum += count;
                }
            count++;
            }
        String msg = String.format("The sum of all even numbers between 1 and %d is: ", n);
        System.out.println(msg + sum);

        }
    }

