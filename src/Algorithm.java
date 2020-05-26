import java.util.Scanner;

public class Algorithm {

    public static int runAlgorithm() {
        int x = 0;
        int y = 0;
        int sum = 0;
        do {
            sum += x;
            x = readValueFromUser();

        } while ((x * x < 100));
        sum = sum % 2;
        return sum;
    }

    private static int readValueFromUser() {
        do {
            System.out.println("Type your integer: ");
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
        } while (true);

    }
}
