public class Kantor {
    public static int calculate(int n[]) {
        return calculate(n, n.length);
    }
    public static int calculate(int n[], int length) {
        if (length == 2)
            return calculatePair(n[0], n[1]);
        else
            return calculatePair(calculate(n, length - 1), n[length - 1]);
    }
    public static int calculatePair(int a, int b) {
        return (a + b) * (a + b + 1) / 2 + a;
    }
}
