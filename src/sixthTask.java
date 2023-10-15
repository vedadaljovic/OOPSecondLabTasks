import java.util.Scanner;
public class sixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want to print the sentence?: ");
        int numberOfPrints = scanner.nextInt();

        for (int i = 0; i < numberOfPrints; i++) {
            printStars();
        }

    }
    public static void printStars(){
        System.out.println("In the beginning there were the swamp, the hoe, and Java.");
    }
}
