package homework3;

public class Power_5 {
    public static void main(String[] args) {
        int n = 3;
        int x = 3;
        System.out.println(x + " to the power of " + n + " equals " + power(x, n));
    }

    static int power(int x, int n) {
        int result = x;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }
}
