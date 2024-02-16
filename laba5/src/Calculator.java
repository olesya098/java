import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();//создается объект класса Calculator с именем calculator.
        Scanner scanner = new Scanner(System.in);

        // Ввод значения x для первого выражения
        System.out.print("Введите значение x для выражения 1: ");
        int x1 = scanner.nextInt();
        int result1 = calculator.Expression1(x1);//Здесь вызывается метод Expression1()
        // объекта calculator с передачей значения x1 в качестве аргумента
        System.out.println("Значение выражения 1 для x = " + x1 + ": " + result1);

        // Ввод значений a и b для второго выражения
        System.out.print("Введите значения a и b для выражения 2 (через пробел): ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        double result2 = calculator.Expression2(a2, b2);
        System.out.println("Значение выражения 2 для a = " + a2 + ", b = " + b2 + ": " + result2);

        // Ввод значений a, x и b для третьего выражения
        System.out.print("Введите значения a, x и b для выражения 3 (через пробел): ");
        int a3 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        double result3 = calculator.Expression3(a3, x3, b3);
        System.out.println("Значение выражения 3 для a = " + a3 + ", x = " + x3 + ", b = " + b3 + ": " + result3);
    }

    public int Expression1(int x) {
        int y = 3*x + 5;
        return y;
    }

    public double Expression2(int a, int b) {
        double y = (double) (a + b) / (a - b);
        return y;
    }

    public double Expression3(int a, int x, int b) {
        double y = Math.pow((a*x) / b, 2);
        return y;
    }
}