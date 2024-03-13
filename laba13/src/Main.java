interface Tovar{
    void Name();
    void Sale();
    void  Reting();
}
class Product1 implements Tovar {
    String name;
    double sale;
    double reting;

    public Product1(String name, double sale, double reting) {
        this.name = name;
        this.sale = sale;
        this.reting = reting;
    }
    public void Name( ) {
        System.out.println("Продукт № 1 " + name );
    }
    public void Sale( ) {
        System.out.println("Цена (в рублях)" + name + " : " + sale );
    }
    public void Reting( ) {
        System.out.println("Рейтинг " + name + " : " + reting );
    }
}
    class Product2 implements Tovar {
        String name;
        double sale;
        double reting;

        public Product2(String name, double sale, double reting) {
            this.name = name;
            this.sale = sale;
            this.reting = reting;
        }
        public void Name( ) {
            System.out.println("Продукт № 2 " + name );
        }
        public void Sale( ) {
            System.out.println("Цена (в рублях)" + name + " : " + sale );
        }
        public void Reting( ) {
            System.out.println("Рейтинг " + name + " : " + reting );
        }

    }
        class Product3 implements Tovar{
            String name;
            double sale;
            double reting;
    public Product3( String name, double sale, double reting){
        this.name=name;
        this.sale=sale;
        this.reting=reting;
    }
            public void Name( ) {
                System.out.println("Продукт № 3 " + name );
            }
            public void Sale( ) {
                System.out.println("Цена (в рублях)" + name + " : " + sale );
            }
            public void Reting( ) {
                System.out.println("Рейтинг " + name + " : " + reting);
            }
}
// Интерфейс "Пользователь"
interface User {
    void Login();
    void Password();

}


 class Friends implements User {
    String login;
    String password;

    public Friends ( String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void Login( ) {
        System.out.println("логин: " + login );
    }

    @Override
    public void Password() {
        System.out.println("Пароль: "+ password );
    }
}



// Класс Преподаватель
class Teacher implements User {
        String login;
        String password;

        public Teacher ( String login, String password) {
            this.login = login;
            this.password = password;
        }
        public void Login( ) {
            System.out.println("логин: " + login );
        }

        @Override
        public void Password() {
            System.out.println("Пароль: "+ password );
        }
    }

// Класс Студент
class Student implements User {
        String login;
        String password;

        public Student( String login, String password) {
            this.login = login;
            this.password = password;
        }
        public void Login( ) {
            System.out.println("логин: " + login );
        }

        @Override
        public void Password() {
            System.out.println("Пароль: "+ password );
        }
}
    class Pocupca implements Tovar, User{
        String login;
        String name;
        double sale;
        public Pocupca ( String login, String name, double sale ) {
            this.login = login;
            this.name = name;
            this.sale=sale;
        }
        @Override
        public void Name( ) {}
        @Override
        public void Sale( ) {}
        @Override
        public void Reting( ) {}
        @Override

        public void Login( ) {}

        @Override
        public void Password() {}

        public void Print(){
            System.out.println("Пользователь " + login + " купил: " + name + " по цене: " + sale);
        }
}

public class Main {
    public static void main(String[] args) {
        Product1 product1 = new Product1("Греча", 90, 4.5);
        Product2 product2 = new Product2("Яблоки", 67, 5.0);
        Product3 product3 = new Product3("Молоко", 135, 3.5);
        product1.Name();
        product1.Sale();
        product1.Reting();

        product2.Name();
        product2.Sale();
        product2.Reting();

        product3.Name();
        product3.Sale();
        product3.Reting();

        Teacher teacher1 = new Teacher("Иванов Степан Иванович", "fehaeoaBBUH");
        Friends friends = new Friends ("Петров Василий Васильевич", "ngwehgeuDGUI");
        Student student1 = new Student("Старовойтов Иван Иванович", "oefoejeiagGSYAG");

        teacher1.Login();
        teacher1.Password();

        friends.Login();
        friends.Password();

        student1.Login();
        student1.Password();

        Pocupca pocupca1 = new Pocupca(friends.login, product1.name, product1.sale);
        pocupca1.Print();
    }
}
