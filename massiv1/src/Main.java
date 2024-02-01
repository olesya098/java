import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int size1 = in.nextInt();

        // Создание двумерного массива
        int[][] sortArr = new int[size1][];

        // Ввод элементов массива
        for (int i = 0; i < size1; i++) {
            System.out.print("Введите количество элементов в строке " + (i + 1) + ": ");
            int size2 = in.nextInt();
            sortArr[i] = new int[size2];

            System.out.println("Введите элементы для строки " + (i + 1) + ":");
            for (int j = 0; j < size2; j++) {
                sortArr[i][j] = in.nextInt();
        }}
        sort(sortArr);
        printArray(sortArr);
    }

    public static void sort(int[][] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 1; j < sortArr[i].length; j++) {
                int key = sortArr[i][j];
                int k = j - 1;

                while (k >= 0 && sortArr[i][k] > key) {
                    sortArr[i][k + 1] = sortArr[i][k];
                    k--;
                }

                sortArr[i][k + 1] = key;
            }
        }
    }

    public static void printArray(int[][] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr[i].length; j++) {
                System.out.print(sortArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}