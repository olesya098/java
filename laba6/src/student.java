import java.lang.System;
import java.util.Arrays;
import java.util.Comparator;

public class student {
        String Name;
        int NumberGroup;
        double gradies;

        public student(String Name, int NumberGroup, double gradies) {
            this.Name = Name;
            this.NumberGroup = NumberGroup;
            this.gradies= gradies;

        }
        public static void main(String[] args) {
            student[] students = new student[10];
            students[0] = new  student ("Петров В. В.", 12345,4.45 );
            students[1] = new student ("Иванов А. А.", 23456,5.0 );
            students[2] = new student ("Сидоров В. И.", 34567, 3.34);
            students[3] = new student ("Смирнова О. С.", 45678,5.55 );
            students[4] = new student ("Козлова Е. В.", 56789, 4.87);
            students[5] = new  student ("Бублик В. В.", 12345,3.96);
            students[6] = new student ("Соколова П. А.", 23456,5.00 );
            students[7] = new student ("Поликов В. И.", 34567, 3.40);
            students[8] = new student ("Бобров К. К.", 45678,5.00 );
            students[9] = new student ("Польков Е. В.", 56789, 4.98);

            // Сортировка по возрастанию среднего балла методом вставки
            for (int i = 1; i < students.length; i++) {
                student key = students[i];//сохранение текущего эл-та
                int j = i - 1;//сравнение с предыдущими эл-тами
                while (j >= 0 && students[j].gradies > key.gradies) {//сравнение на то что средний балл больше чем у key
                    //двигаем эл-ты вправо, что б освободить место для начального эл-та
                    students[j + 1] = students[j];//сдвиг
                    j--;//перемещаемся к следующему предыдущему элементу
                }
                students[j + 1] = key;//Вставляем key на место элемента, который был последним сдвинутым вправо
            }

            // Вывод отсортированного массива
            for (student student1 : students) {// используется для прохода по элементам массива
                System.out.println(student1.Name + ": " + student1.gradies);
            }
            // Вывод отсортированного массива и фамилий студентов с оценками только 4 или 5
            System.out.println("Студенты с оценками только 4 или 5:");
            for (student student : students) {
                if (student.gradies >= 4 && student.gradies <= 5) {
                    System.out.println("Фамилия: " + student.Name + ", Номер группы: " + student.NumberGroup);
                }
            }
            System.out.println();



        }
    }
