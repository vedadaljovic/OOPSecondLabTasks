import java.util.Scanner;
import java.util.Random;
public class tenthTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = drawNumber(random);
        int guesses=0;
        int userGuess;

        do {
            System.out.println("Guess a number: ");
            userGuess = scanner.nextInt();
            guesses++;

            if(userGuess < secretNumber){
                System.out.println("The number is greater, guesses made: " + guesses);
            }else if (userGuess > secretNumber){
                System.out.println("The number is lesser, guesses made: "+ guesses);
            }else {
                System.out.println("Congratulations, your guess is correct!");
            }
        }while (userGuess != secretNumber);
    }
    private static int drawNumber(Random random){
        return random.nextInt(101);
    }
}
