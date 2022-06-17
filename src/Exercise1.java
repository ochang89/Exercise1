import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer x: ");
        int x = input.nextInt();
        int count = 1;

        while(count <= x){
            if(count % 2 != 0){
                if(count % 3 == 0){
                    System.out.println(count + " is a multiple of 3");
                }
            }
            count++;
        }
    }
}
