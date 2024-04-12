import java.io.*;

public class laba16_m {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String s;
            StringBuilder buff = new StringBuilder(); //буфер для сбора результата
            //используется для создания и изменения строк
            while ((s = reader.readLine()) != null) { //чтение строки из файла
                //читает строку из потока ввода
                //присваивает следующую строку из потока ввода переменной s.
                //s проверяется на null
                buff.append(s).append("\n"); //добавление строки в конец
            }
            String result = buff.toString().replaceAll("(?s)/\\*.*?\\*/", "");
            result = result.replaceAll("//.*", "");
            writer.write(result);
            System.out.println("Удаление комментариев выполнено успешно.");

        } catch (IOException e) {
            System.out.println("произошла ошибка ввода/вывода"+e.getMessage());
        }
    }
}