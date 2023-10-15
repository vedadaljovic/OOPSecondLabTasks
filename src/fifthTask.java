import java.util.Scanner;
public class fifthTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = scanner.nextInt();

        double sum = 0.0;

        for(int i = 0; i <= number; i++) {
            double power = Math.pow(2, i);
            sum += power;
        }
        int result = (int)sum;
        System.out.println("The result is " + result);
    }
}
