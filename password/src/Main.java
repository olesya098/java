import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = input.next();
        System.out.println(check(password));
    }

    public static boolean check(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[!#$%()*+\\-?~])(?!.*(\\S)\\1).{8,}$")
                && povtorSim(password) // Не повторяющиеся буквы и цифры
                && lastsim(password); // Нет последовательностей символов
    }


    private static boolean povtorSim(String password) {// повторяющиеся символы
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);// символ пароля сохраняется в переменной
            for (int j = i + 1; j < password.length(); j++) {
                if (currentChar == password.charAt(j)) {//  текущий символ = какому-либо символу.
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean lastsim(String password) {// последовательные символы
        for (int i = 0; i < password.length() - 2; i++) {
            if (password.charAt(i + 1) - password.charAt(i) == 1 && password.charAt(i + 2) - password.charAt(i + 1) == 1);
            //проверка последовательных.
        }
        return true;
    }
}