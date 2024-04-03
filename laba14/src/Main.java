import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом");

        String s = scanner.nextLine();
        String regex = "((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5])";

        Pattern prov = Pattern.compile(regex);//Создается объект класса Pattern,
        // который представляет скомпилированное регулярное выражение.
        Matcher matcher = prov.matcher(s);//Создается объект класса Matcher,
        // который используется для сопоставления регулярного выражения с введенной строкой.

         while (matcher.find()) {//Этот код проверяет, найдено ли совпадение регулярного выражения во введенной строке.
            String ipadress = matcher.group();//Если совпадение найдено,
            // то получаем найденный IP-адрес с помощью метода group() у объекта Matcher.
            //Метод group() возвращает подстроку, соответствующую последнему найденному совпадению.
            System.out.println("Найденный IP-адрес: " + ipadress);
        }
    }
}