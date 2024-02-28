import java.lang.System;


public class student {
        String Name;
        int NumberGroup;
        int [] grades;

        public student(String Name, int NumberGroup, int [] grades) {
            this.Name = Name;
            this.NumberGroup = NumberGroup;
            this.grades= grades;

        }
    public double calculate1() {
        double sum = 0;//сюда суммируется значение всех оценок
        for (int grade : grades) {
            sum += grade;//сложение оценок
        }
        return (double) sum / grades.length;//деление суммы оценок на длину массива
    }
        public static void main(String[] args) {
            student[] students = new student[10];
            students[0] = new  student ("Петров В. В.", 12345,new int[]{3,4,5,2,4} );
            students[1] = new student ("Иванов А. А.", 23456,new int[]{ 3,5,2,3,4});
            students[2] = new student ("Сидоров В. И.", 34567, new int[]{3,3,3,3,3});
            students[3] = new student ("Смирнова О. С.", 45678,new int[]{5,5,5,5,5});
            students[4] = new student ("Козлова Е. В.", 56789, new int[]{4,4,4,4,4});
            students[5] = new  student ("Бублик В. В.", 12345,new int[]{2,2,2,2,2});
            students[6] = new student ("Соколова П. А.", 23456,new int[]{3,4,3,4,3});
            students[7] = new student ("Поликов В. И.", 34567, new int[]{5,3,5,3,5});
            students[8] = new student ("Бобров К. К.", 45678,new int[]{4,2,4,2,4 });
            students[9] = new student ("Польков Е. В.", 56789, new int[]{5,3,4,5,3});

            // Сортировка по возрастанию среднего балла методом вставки
            for (int i = 1; i < students.length; i++) {
                student key = students[i];//сохранение текущего эл-та
                int j = i - 1;//сравнение с предыдущими эл-тами
                while (j >= 0 && students[j].calculate1() > key.calculate1()) {//сравнение на то что средний балл больше чем у key
                    //двигаем эл-ты вправо, что б освободить место для начального эл-та
                    students[j + 1] = students[j];//сдвиг
                    j--;//перемещаемся к следующему предыдущему элементу
                }
                students[j + 1] = key;//Вставляем key на место элемента, который был последним сдвинутым вправо
            }

            // Вывод отсортированного массива
            for (student student1 : students) {// используется для прохода по элементам массива
                System.out.println(student1.Name + ": " + student1.calculate1());
            }
            // Вывод отсортированного массива и фамилий студентов с оценками только 4 или 5
            System.out.println("Студенты с оценками только 4 или 5:");
            for (student student : students) {
                if (student.calculate1() >= 4) {
                    System.out.println("Фамилия: " + student.Name + ", Номер группы: " + student.NumberGroup);
                }
            }
            System.out.println();



        }
    }
