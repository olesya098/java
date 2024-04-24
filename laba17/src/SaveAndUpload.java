import java.io.*;
import java.util.Scanner;
class laba17 implements Serializable {
    public double x;
    public double y;

    public laba17(double x) {
        this.x = x;
        this.y = calculateY(x);
    }

    private double calculateY(double x) {
        return x - Math.sin(x);
    }

    public double getY() {
        return y;
    }

    public void saveState(String filename) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("state.txt"))) {
            output.writeObject(this);
            System.out.println("Состояние объекта успешно сохранено в файл " );
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении состояния объекта: " + e.getMessage());
        }
    }

    public static laba17 uploadState(String file) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("state.txt"))) {
            laba17 obj = (laba17) input.readObject();//чтение объекта
            System.out.println("Состояние объекта успешно восстановлено из файла ");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при восстановлении состояния объекта: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            laba17 calculator = null;
            while (true) {
                System.out.println("""
            \nВыберите действие:
            1. Вычислить значение выражения
            2. Сохранить состояние объекта
            3. Восстановить состояние объекта
            4. Выйти""");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Введите значение x: ");
                        double x = scanner.nextDouble();
                        calculator = new laba17(x);
                        System.out.println("Значение выражения: " + calculator.getY());
                        break;
                    case 2:
                        if (calculator != null) {
                            calculator.saveState("state.txt");
                        } else {
                            System.out.println("Сначала вычислите значение выражения.");
                        }
                        break;
                    case 3:
                        calculator = laba17.uploadState("state.txt");
                        if (calculator != null) {
                            System.out.println("Значение выражения после восстановления: " + calculator.getY());
                        }
                        break;
                    case 4:
                        System.out.println("Программа завершена.");
                        return;
                    default:
                        System.out.println("Неверный ввод. Пожалуйста, выберите действие от 1 до 4.");
                }
            }
        }
    }
}