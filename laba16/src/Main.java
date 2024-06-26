import java.util.Scanner;
import java.util.regex.*;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом");

        String s = scanner.nextLine();
        String regex = "((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5])";

        Pattern prov = Pattern.compile(regex);
        Matcher matcher = prov.matcher(s);

        FileWriter writer = null;
        try {
            writer = new FileWriter("ip.txt");
            if (matcher.find()) {
                String ipAddress = matcher.group();//Извлекает найденный IP-адрес с помощью group().
                writer.write("Найденный верный IP-адрес: " + ipAddress);//используется для записи
                System.out.println("Найденный верный IP-адрес: " + ipAddress);
            } else {
                String message = "IP-адрес не найден";
                writer.write(message);//используется для записи
                System.out.println(message);
            }
          //  writer.close();

        }
        catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода " + e.getMessage());
        }
        finally {
            // Обработка исключения при закрытии потока
            if (writer != null) {
                try {
                    writer.close(); // Закрытие потока
                }
                catch (IOException e) {
                    System.out.println("Произошла ошибка при закрытии потока " + e.getMessage());
                }
            }
        }

    }}