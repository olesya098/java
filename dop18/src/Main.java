import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] R1 = {0, 1, 2, 3};
        int[] R2 = {1, 2, 3, 4, 5};
        int[] Rx = {1, 2, 3, 4};
        int R1le = R1.length;
        int R2le = R2.length;
        int Rxle = Rx.length;
        int totalLength = R1le * R2le * Rxle * R1le * R2le * Rxle * R2le;
        int[] z = new int[totalLength];
        System.out.println(totalLength);

        List<Integer> list = new ArrayList<>();

        // Добавляем элементы из массива R2 в список
        for (int value : R2) {
            list.add(value);
        }

        // Добавляем элементы из массива Rx в список
        for (int value : Rx) {
            list.add(value);
        }

        // Добавляем элементы из массива R1 в список
        for (int value : R1) {
            list.add(value);
        }

        int index = 0;
        for (int value : list) {
            for (int i = 0; i < totalLength / list.size(); i++) {
                z[index++] = value;
            }
        }

        // Вывод содержимого массива myArray
        System.out.print("Содержимое массива myArray: ");
        for (int value : z) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Находим похожие числа из массива myArray на числа из Rx без повторений
        Set<Integer> number1 = new HashSet<>();//HashSet - коллекция без повторов эл-тов
        //позволяет использовать целочисленные типы данных как объекты
        for (int number : z) {
            int w = number % 10;//делим на 10 что б сравнить последнее число с массивом
            for (int rxValue : Rx) {
                if (w == rxValue) {// сравнение с массивом
                    number1.add(number);//добавление числа в set
                    break; // Выходим из внутреннего цикла, так как число уже найдено
                }
            }
        }

        // Выводим похожие числа без повторений
        System.out.print("Похожие числа из массива myArray на числа из Rx без повторений: ");
        for (int number : number1) {
            System.out.print(number + " ");
        }
    }
}