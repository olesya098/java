import java.util.*;


interface Sorting {
    void Sort(int[] numbers);
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
//заполнения массива arr
        System.out.println("Введите 5 чисел для заполнения массива:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        Sorting max = (int[] numbers) -> {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                        // Сортировка вставками (по возрастанию)
                        for (int i = 1; i < arr.length; i++) {
                            int key = arr[i];
                            int j = i - 1;
                            while (j >= 0 && arr[j] > key) {
                                arr[j + 1] = arr[j];
                                j--;
                            }
                            arr[j + 1] = key;
                        }
                }

        };
        //сортировка расчёской(по убыванию)
        Sorting min = (int[] numbers) -> {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                int n = arr.length;
                double shrinkFactor = 1.3;
                boolean sorted = false;

                int gap = n;
                while (!sorted) {
                    gap = (int) (gap / shrinkFactor);
                    if (gap <= 1) {
                        gap = 1;
                        sorted = true;
                    }

                    for (int i = 0; i + gap < n; i++) {
                        if (arr[i] < arr[i + gap]) {
                            swap(arr, i, i + gap);
                            sorted = false;
                        }
                    }
                }
                
            }
        };

        System.out.print("Выберите сортировку (< - по убыванию, > - по возрастанию): ");
        switch (input.next()) {
            case "<":
                Sort(arr, min);//передача массива arr и лямбда-выражения min в качестве аргументов.
                break;
            case ">":
                Sort(arr, max);//передача массива arr и лямбда-выражения max в качестве аргументов.
                break;
            default:
                System.out.println("Неверный выбор");
                break;
        }}

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // для вывода исходного массива на консоль
    public static void Sort(int[] numbers, Sorting sortWay) {// вызова метода Sort из объекта sortWay
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        System.out.println();
        sortWay.Sort(numbers);//вызывает метод Sort (определенный в интерфейсе Sorting)
        //из объекта sortWay и передает ему массив
        for (int i : numbers) {//i - значение каждого элемента массива
            System.out.print(i + " ");
        }
    }
}