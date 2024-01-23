import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("  Введите верхний предел");
        double result = 0;
        double z = 0;
        double r = in.nextDouble();
        System.out.println("  Введите число х");
        double x = in.nextDouble();
        double w = 0;
        double a = 0;
        double q = 0;
        if (x < -1) {
            for (double n = 0; n <= r; n++) {
                z = 2 * n + 1;
                a = Math.pow(x, z);
                w = n + 1;
                q = Math.pow(-1, w) / (z * a);
                result = result + q;
            }
            System.out.println(result);
        }
        else {
            System.out.println("Ошибка: не корректное число х");
        }
    }
}