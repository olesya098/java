import java.util.Scanner;

class Calculator {
    private static Calculator instance = null;//статическая переменная для хранения единственного экземпляра класса
    private Calculator() {}//приватный конструктор, чтобы предотвратить создание экземпляров извне класса

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public double calculate(double x, double y) {
        double result = 2 * x + 3 / y;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        Calculator calc = Calculator.getInstance();
        double result = calc.calculate(x, y);
        System.out.println("Результат выражения 2*" + x + "+3/" + y + " = " + result);

        // Попытка создать второй экземпляр класса
        Calculator calc2 = Calculator.getInstance();
        if (calc == calc2) {//проверка, что calc и calc2 ссылаются на один и тот же экземпляр
            System.out.println("Создан только один экземпляр класса Calculator");
        } else {
            System.out.println("Ошибка: создано несколько экземпляров класса Calculator");
        }
    }
}
