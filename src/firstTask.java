import java.util.Scanner;
public class firstTask {
   /*Create a program that asks the user for a password.
    If the password is right, a secret message is shown to the user. */

    public static void main(String[] args){
        while(true) {
        String correctPassword = "carrot";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the password: ");
        String password = scanner.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
            break;


        }else {
            System.out.println("Wrong!");
        }
    }
}
}
