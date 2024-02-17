import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Ввод значения x для первого выражения
        System.out.print("Введите значение x для выражения y=3x+5: ");
        double x1 = scanner.nextInt();
        double result1 = calculator.calculate1(x1);
        System.out.println("результат выражения y=3x+5: "  + result1);

        // Ввод значений a и b для второго выражения
        System.out.print("Введите значения a и b для выражения y=(a+b)/(a-b)(через пробел): ");
        double a2 = scanner.nextInt();
        double b2 = scanner.nextInt();
        double result2 = calculator.calculate2(a2, b2);
        System.out.println("Результат выражения y=(a+b)/(a-b): "  + result2);

        // Ввод значений a, x и b для третьего выражения
        System.out.print("Введите значения a, x и b для выражения y=(ax/b)! (через пробел): ");
        double a3 = scanner.nextInt();
        double x3 = scanner.nextInt();
        double b3 = scanner.nextInt();
        double result3 = calculator.calculate3(a3, x3, b3);
        System.out.println("Результат выражения y=(ax/b)!: " + result3);
    }


    public double calculate1(double x) {
        return 3*x + 5;

    }

    public double calculate2(double a, double b) {
        return (a + b) / (a - b);

    }

    public double calculate3(double a, double x, double b) {
        double ax = a*x;
        double result = factorial(ax) / b;
        return  result;
    }

    public double factorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);//метод вызывает сам себя с аргументом n-1,
            // чтобы вычислить факториал для меньшего числа.
            // Затем результат умножается на n и возвращается.
            //рекурсивно вызывается до тех пор пока значение n не достигнет 0 или 1
        }
    }
}
