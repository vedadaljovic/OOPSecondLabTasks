import java.util.Scanner;
public class secondTask {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        for (int i = 1; i <= 3; i++){
            System.out.println("Type the first number: ");
            read = reader.nextInt();
            sum += read;

            System.out.println("Type the second number: ");
            read = reader.nextInt();
            sum += read;

            System.out.println("Type the third number: ");
            read = reader.nextInt();
            sum += read;
            break;
        }
        System.out.println("The sum of the three numbers is: " + sum);
    }
}
