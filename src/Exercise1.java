import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer x: ");
        int x = input.nextInt();
        int count = 1;

        // Stop loop after count reaches x
        while(count <= x){
            // For all not even numbers (odd)
            if(count % 2 != 0){
                // Find the numbers that are multiples of 3, then print them
                if(count % 3 == 0){
                    System.out.println(count + " is a multiple of 3");
                }
            }
            count++;
        }
    }
}
