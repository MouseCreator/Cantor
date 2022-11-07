import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter: ");
            String numbers = scanner.nextLine();
            if (numbers.equals("exit"))
                break;
            String[] s = numbers.split(" ");
            int[] n = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                n[i] = Integer.parseInt(s[i]);
            }
            System.out.println("C"+Arrays.toString(n) + " = " + Kantor.calculate(n));

        }

    }
}