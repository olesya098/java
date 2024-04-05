import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String input = scanner.nextLine();

        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
        {
            input = input.replaceAll("\\b" + matcher.group() + "\\b", "<strong>" + matcher.group() + "</strong>");
        }
        System.out.println(input);
    }
}
