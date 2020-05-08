package jichu;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Polynomial {
    static double polynomial(double a[], int n, double x) {
        double result = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            result = result * x + a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int n;
        double a[] = new double[10];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        double x, result;
        x = scanner.nextDouble();
        result = polynomial(a, n, x);
        DecimalFormat demicalFormat = new DecimalFormat("0.0000000E000");
        DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
        System.out.println("x=" + decimalFormat1.format(x) + "时,p(x)=" + demicalFormat.format(result));
    }
}
