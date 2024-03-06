
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Иванов Алексей Сергеевич", 18, "79648689330", 1, "Математика", 2019);
        students[1] = new Student("Сергеев Акакий Акакиевич", 20, "796484859330", 1, "Литература", 2023);
        students[2] = new Student("Иванов Алексей Сергеевич", 19, "79648444330", 1, "Информационные системы и программирование", 2020);
        System.out.println("ФИО и возраст всех студентов:");
        for (Student student : students) {
            System.out.println(student.Name + " " + student.getAge() + " лет");
        }
        String Faculty = "Информационные системы и программирование";

        System.out.println("\nСписок студентов факультета " + Faculty + ":");
        for (Student student : students) {
            if (student.faculty.equals(Faculty)) {
                System.out.println(student.Name);
            }
        }

        int Year1 = 2020;

        System.out.println("\nСписок студентов, поступивших после " + Year1 + " года:");
        for (Student student : students) {
            if (student.getData() > Year1) {
                    System.out.println(student.Name);
                }
            }
        }
    }

class Person {
    public String Name;
    private int age;
    public String phone;

    public Person(int age, String Name, String phone) {
        this.age = age;
        this.Name = Name;
        this.phone = phone;
    }
    public int getAge(){
        return age;
    }
}
class Student extends Person{
    public int cours;
    public String faculty;
    private int data;
    public Student( String Name,int age, String phone, int cours,String faculty,int data){
        super(age,Name,phone);
        this.cours=cours;
        this.data=data;
        this.faculty=faculty;
    }

    public int getData() {
        return data;
    }
}