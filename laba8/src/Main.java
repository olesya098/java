// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class Person {
    String Name1;
    String Name2;
    int Date;

    public Person(String Name1, String Name2, int Date) {
        this.Name1 = Name1;
        this.Name2 = Name2;
        this.Date = Date;
    }

    public void printInfo() {
        System.out.println("Имя: " + Name1);
        System.out.println("Фамилия: " + Name2);
        System.out.println("Год рождения: " + Date);
    }

}
 class Car{
        String marca;
        int year;
        double dvigatel;



        public Car(String brand, int yearOfProduction, double engineCapacity) {
            this.marca = brand;
            this.year = yearOfProduction;
            this.dvigatel = engineCapacity;
        }

        public void printInfo() {
            System.out.println("Марка: " + marca);
            System.out.println("Год выпуска: " + year);
            System.out.println("Объем двигателя: " + dvigatel);
        }
    }

class Book {
        String title;
        String author;
        int yearbook;

        public Book(String title, String author, int yearOfPublication) {
            this.title = title;
            this.author = author;
            this.yearbook = yearOfPublication;
        }

        public void printInfo() {
            System.out.println("Название: " + title);
            System.out.println("Автор: " + author);
            System.out.println("Год выпуска: " + yearbook);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Person person = new Person("Иван", "Иванов", 1990);
            Car car = new Car("Toyota", 2010, 2.0);
            Book book = new Book("Война и мир", "Лев Толстой", 1869);

            person.printInfo();
            car.printInfo();
            book.printInfo();

            read(person, book, car);
        }

        public static void read(Person person, Book book, Car car) {//вызывает метод read() с передачей объектов person, book и car в качестве параметров.
            System.out.println(person.Name1 + " читает книгу '" + book.title + "' про машину '" + car.marca + "'");
        }
    }

