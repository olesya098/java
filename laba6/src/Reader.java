import java.lang.System;

    public class Reader {
        String Name;
        int CardNumber;
        String faculty;
        String date;
        String phoneNumber;

        public Reader(String Name, int CardNumber, String faculty, String date, String phoneNumber) {
            this.Name = Name;
            this.CardNumber = CardNumber;
            this.faculty = faculty;
            this.date = date;
            this.phoneNumber = phoneNumber;
        }

        public void takeBook(int numOfBooks) {
            System.out.println(Name + " взял " + numOfBooks + " книги.");
        }

        public void takeBook(String[] books) {
            System.out.print(Name + " взял книги: ");
            for (String book : books) {
                System.out.print(book + ", ");
            }
            System.out.println();
        }



        public void returnBook(int numOfBooks) {
            System.out.println(Name + " вернул " + numOfBooks + " книги.");
        }
        public void returnBook(String[] books) {//последовательно принимает значение каждого элемента массива books
            System.out.print(Name + " вернул книги: ");
            for (String book : books) {//текущий элемент массива books присваивается переменной book
                System.out.print(book + ", ");
            }
            System.out.println();
        }



        public static void main(String[] args) {
            Reader[] readers = new Reader[5];
            readers[0] = new Reader("Петров В. В.", 12345, "Информатика", "01.01.1990", "+123456789");
            readers[1] = new Reader("Иванов А. А.", 23456, "Физика", "05.05.1985", "+987654321");
            readers[2] = new Reader("Сидоров В. И.", 34567, "Химия", "10.10.1995", "+567890123");
            readers[3] = new Reader("Смирнова О. С.", 45678, "История", "15.09.1992", "+246813579");
            readers[4] = new Reader("Козлова Е. В.", 56789, "Математика", "20.12.1998", "+135792468");

            readers[0].takeBook(3);
            readers[0].takeBook(new String[]{"Мифы", "Драмы","Словарь"});
            readers[0].returnBook(2);
            readers[0].returnBook(new String[]{"Мифы", "Драмы", "Романы"});

            readers[1].takeBook(3);
            readers[1].takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия"});
            readers[1].returnBook(3);
            readers[1].returnBook(new String[]{"Мифы", "Драмы", "Романы"});

            readers[2].takeBook(4);
            readers[2].takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия", "Фантастика"});
            readers[2].returnBook(1);
            readers[2].returnBook(new String[]{"Романы"});

            readers[3].takeBook(5);
            readers[3].takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия", "Фантастика","Драмы"});
            readers[3].returnBook(2);
            readers[3].returnBook(new String[]{"Мифы", "Драмы"});

            readers[4].takeBook(4);
            readers[4].takeBook(new String[]{ "Словарь", "Энциклопедия", "Фантастика","Драмы"});
            readers[4].returnBook(3);
            readers[4].returnBook(new String[]{"Мифы", "Драмы", "Романы"});
        }
    }
