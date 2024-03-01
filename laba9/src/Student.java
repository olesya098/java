// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.lang.System;
public class Student {
    private String Name;
    private String Date;
    private String address;
    private String phone;
    private int course;
    private String group;

    public Student(String Name, String Date, String address, String phone, int course, String group) {
        this.Name = Name;
        this.Date = Date;
        this.address = address;
        this.phone = phone;
        this.course = course;
        this.group = group;
    }


    public String getName() {//ФИО(чтение)
        return Name;
    }

    public void setName(String Name) {//ФИО(запись)
        this.Name = Name;
    }
//дата поступления(запись),

    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getDate() {//Адрес(чтение)
        return Date;
    }

    public String getAddress() {//Адрес(чтение)
        return address;
    }

    public String getPhone() {//Телефон(чтение)
        return phone;
    }

    public void setPhone(String phone) {//Телефон(запись)
        this.phone = phone;
    }
//Курс(запись)


    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }
//Факультет(чтение)


    public static void main(String[] args) {
        // Создаем массив из трех объектов Student
        Student[] students = new Student[3];
        students[0] = new Student("Иванов Иван Васильевич", "01.02.2020", "ул. Ленина, 1", "1234567890", 1, "Информатика");
        students[1] = new Student("Петров Иван Петрович", "02.04.2019", "ул. Пушкина, 2", "0987654321", 2, "Математика");
        students[2] = new Student("Сидоров Даниил Владимирович", "04.05.2020", "ул. Гагарина, 3", "9876543210", 1, "Физика");

        // а)
        System.out.println("ФИО всех студентов:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        // б)
        String Faculty = "Математика";
        System.out.println("Список студентов факультета " + Faculty + ":");
        for (Student student : students) {
            if (student.getGroup().equals(Faculty)) {
                System.out.println(student.getName());
            }
        }

        // в)
        int Year = 2020;
        System.out.println("\nСписок студентов, поступивших после " + Year + " года:");//Вывод списка студентов, поступивших после заданного года
        for (Student student : students) {// Цикл, который проходит по всем объектам Student в массиве students
            int postupYear = Integer.parseInt(student.getDate().split("\\.")[2]);
            if (postupYear > Year) {
                System.out.println(student.getName());// Вывод ФИО студента, если год поступления больше заданного года (poiskYear)
            }
        }
    }
}


