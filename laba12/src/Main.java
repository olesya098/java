// Интерфейс "Пользователь"
 interface User {//задают логин, пароль и вход в систему
    void Login();
    void Password();

}

// Абстрактный класс "People"
 abstract class People implements User {
     String fullName;
     int age;
    String login;
     String position;
     String password;


    public People(String fullName, int age, String login, String position, String password) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.login = login;
        this.password = password;
    }}



// Класс Преподаватель
 class Teacher extends People {
    public Teacher(String fullName, int age, String login, String position, String password) {
        super(fullName, age,login, position, password);
    }
    @Override
    public void Login( ) {
        System.out.println("логин " + fullName + ":" + login );
    }

    @Override
    public void Password() {
        System.out.println("Пароль " + fullName + ":"+ password );
    }

}

// Класс Студент
class Student extends People {
    public Student(String fullName, int age, String login, String position, String password) {
        super(fullName, age,login, position, password);
    }
    @Override
    public void Login( ) {
        System.out.println("логин " + fullName + ":" + login );
    }

    @Override
    public void Password() {
        System.out.println("Пароль " + fullName+ ":" + password );
    }

}

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов Степан Иванович", 35, "fwkghwuehg@yandex.ru", "Преподаватель","fehaeoaBBUH");
        Teacher teacher2 = new Teacher("Петров Василий Васильевич", 60, "jweubeug@yandex.ru","Преподаватель","ngwehgeuDGUI");

        Student student1 = new Student("Старовойтов Иван Иванович", 20, "seugbgwrg@yandex.ru", "Студент","oefoejeiagGSYAG");
        Student student2 = new Student("Козина Ирина Владимировна", 21, "knweview@yandex.ru","Студент","kfaiwffdtHFY");

        teacher1.Login();
        teacher1.Password();

        teacher2.Login();
        teacher2.Password();

        student1.Login();
        student1.Password();

        student2.Login();
        student2.Password();

    }
}
