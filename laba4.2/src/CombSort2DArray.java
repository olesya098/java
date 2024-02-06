import java.util.Arrays;
import java.util.Scanner;

public class CombSort2DArray {
    public static void combSort(int[] row) {
        double factor = 1.247;
        int step = row.length - 1;

        while (step >= 1) {
            for (int i = 0; i + step < row.length; ++i) {
                if (row[i] > row[i + step]) {
                    swap(row, i, i + step);
                }
            }
            step = (int)(step / factor);
        }
    }

    public static void swap(int[] row, int i, int j) {
        int temp = row[i];
        row[i] = row[j];
        row[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nИсходный массив:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
            combSort(arr[i]);
        }

        System.out.println("\nОтсортированный массив по возрастанию строк:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}