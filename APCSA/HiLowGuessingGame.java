/*Program randomly generates a value between 1 and 100. User then guesses it. 
Ask user to enter a number between 1 and 100. Tell them if their guess was too hi or lo.
Keep asking until they get the correct number. Report the # of guesses
Allow user to give up with a sentinel value (but feel free to make fun of them if they quit)
If user gets correct #, ask if they want to play again. */
import java.util.Scanner;
public class HiLowGuessingGame {
    public static void main() {
        int x;
        int 
        x = 0;
        int b = ((int)(Math.random() *100 +1));
        Scanner scan = new Scanner (System.in);
        System.out.println ("Try to guess a number between 1 and 100. Type that number in.");
        int a = scan.nextInt();
       // for (int i = 0; i <= b; i++) {
        if ((a <1 || a >100)) {
            System.out.println ("This number is not within the range. Guess again.");
        }
        else if (a == i) {
            System.out.println ("Congratulations, you have guessed correctly! Thank you for playing!!");
        }
        else {
            System.out.println ("This is not the number, try again.");
        }
    }
}
