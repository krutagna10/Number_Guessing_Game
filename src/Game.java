import java.util.Scanner;
public class Game {
    public static void main(String [] args) {
        int generated = 1 + (int)(Math.random() * (100 - 1 + 1));
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int count = 0;
        while(input!=generated) {
            System.out.println("Enter a number between 1 to 100 ");
            input = sc.nextInt();
            if (input == generated) {
                System.out.println("You have guessed the correct number in " + (count+1) + " number of guesses");
            }
            else if (input > generated) {
                System.out.println("Go for a lower number");
                count++;
            }
            else {
                System.out.println("Go for a higher number");
                count++;
            }
        }
    }
}
