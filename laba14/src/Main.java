import java.util.Scanner;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом");

        String s = scanner.nextLine();
        String regex = "((1?\\d?\\d|2[0-4]\\d|25[0-5]+)\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5]+)";

        Pattern prov = Pattern.compile(regex);
        Matcher matcher = prov.matcher(s);

        if (matcher.find()) {
            String ipadress = matcher.group();
            System.out.println("Найденный IP-адрес: " + ipadress);
        } else {
            System.out.println("IP-адрес не найден");
        }
    }
}