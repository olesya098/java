import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четное число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Все возможные варианты разложения числа " + number + ":");
            for (int i = 1; i <= number / 2; i++) {
                int first = i;
                int second = number - i;
                System.out.println(first + " + " + second);
            }
        } else {
            System.out.println("Введено нечетное число.");
        }
    }
}
