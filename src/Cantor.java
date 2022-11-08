import java.util.Arrays;
import java.util.Scanner;

public class Cantor {
    public static int calculate(int[] n) {
        return calculate(n, n.length);
    }
    public static int calculate(int[] n, int length) {
        return (length == 2) ?
            calculatePair(n[0], n[1])
        :
            calculatePair(calculate(n, length - 1), n[length - 1]);
    }
    public static int calculatePair(int a, int b) {
        return (a + b) * (a + b + 1) / 2 + a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter: ");
            try {
                String numbers = scanner.nextLine();
                if (numbers.equals("exit"))
                    break;
                String[] s = numbers.split(" ");
                int[] n = new int[s.length];
                for (int i = 0; i < s.length; i++) {
                    n[i] = Integer.parseInt(s[i]);
                }
                System.out.println("C" + Arrays.toString(n) + " = " + calculate(n));
            } catch (Exception e) {
                System.out.println("Unexpected input");
            }

        }
        scanner.close();

    }
}