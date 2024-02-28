
import java.util.Scanner;

public class Calculator {
    //Поля класса
    double x;
    double a;
    double b;
    double x1;
    double a1;
    double b1;

    // Конструктор класса
    public Calculator(double x) {
        this.x = x;// Инициализация переменной x
    }

    public Calculator(double a, double b) {
        this.a = a;// используется для ссылки на текущий объект класса
        this.b = b;// Инициализация переменной b
    }

    public Calculator(double a1, double x1, double b1) {
        this.a1 = a1;// Инициализация переменной a1
        this.x1 = x1;// Инициализация переменной x1
        this.b1 = b1;// Инициализация переменной b1
    }

    // Методы класса
    public double calculate1() {
        return 3 * x + 5;
    }

    public double calculate2() {
        if (a - b == 0) {
            System.out.println("Делить на 0 нельзя!");
            return 0;
        }
        return (a + b) / (a - b);
    }

    public double calculate3() {
        if (b1 == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        double result = 1;
        double factorial = (a1 * x1 / b1);
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Считываем значения x, a и b с клавиатуры
            System.out.print("Введите значение x для y = 3x + 5: ");
            double x = scanner.nextDouble();
            System.out.print("Введите значение a и b для y = (a + b) / (a - b): ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.print("Введите значение x,a и b для y = (ax/b)! : ");
            double x1 = scanner.nextDouble();
            double a1 = scanner.nextDouble();
            double b1 = scanner.nextDouble();

            // Создаем объекты класса Calculator
            Calculator calculator1 = new Calculator(x);// Создание объекта calculator1 с одним параметром x
            Calculator calculator2 = new Calculator(a, b);
            Calculator calculator3 = new Calculator(a, x, b);

            // Вычисляем значения выражений
            double result1 = calculator1.calculate1();// Вычисление результата для выражения 1
            double result2 = calculator2.calculate2();//выражения 2
            double result3 = calculator3.calculate3();//выражения 3

            // Выводим результаты
            System.out.println("Результат выражения 1 : " + result1);
            System.out.println("Результат выражения 2 : " + result2);
            System.out.println("Результат выражения  3 : " + result3);
        }
    }

