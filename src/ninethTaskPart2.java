import java.util.Scanner;
public class ninethTaskPart2 {
    private static void drawStarsPiramid(int numOfRows) {
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want?: ");
        int numOfRows = scanner.nextInt();
        drawStarsPiramid(numOfRows);
    }
}
