import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Ввод значения x для первого выражения
        System.out.print("Введите значение x для выражения y=3x+5: ");
        double x1 = scanner.nextInt();
        double result1 = calculator.calculate1(x1);
        System.out.println("результат выражения y=3x+5: " + result1);

        // Ввод значений a и b для второго выражения
        System.out.print("Введите значения a и b для выражения y=(a+b)/(a-b)(через пробел): ");
        double a2 = scanner.nextInt();
        double b2 = scanner.nextInt();
        double result2 = calculator.calculate2(a2, b2);
        System.out.println("Результат выражения y=(a+b)/(a-b): " + result2);

        // Ввод значений a, x и b для третьего выражения
        System.out.print("Введите значения a, x и b для выражения y=(ax/b)! (через пробел): ");
        double a3 = scanner.nextInt();
        double x3 = scanner.nextInt();
        double b3 = scanner.nextInt();
        double result3 = calculator.calculate3(a3, x3, b3);
        System.out.println("Результат выражения y=(ax/b)!: " + result3);
    }


    public double calculate1(double x) {
        return 3 * x + 5;

    }

    public double calculate2(double a, double b) {
        if (a - b == 0) {
            System.out.println("Делить на 0 нельзя!");
            return 0;
        } else {
            return (a + b) / (a - b);
        }
    }


    public double calculate3(double a, double x, double b) {
        double result = 1;
        double factorial = (a * x / b);
        if (factorial == 0 || factorial == 1) {
            return result;
        }
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        return result;
    }
}
