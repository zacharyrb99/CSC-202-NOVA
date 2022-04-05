package Problem1;

public class MultiplyRecursive {
    public static void main (String[] args) {
        System.out.println(multiply(5, 20));
        System.out.println(multiply(5, -10));
    }

    public static int multiply(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (y < 0) {
            return (-x + multiply(x, y + 1));
        } else {
            return x + multiply(x, y - 1);
        }
    }
}
