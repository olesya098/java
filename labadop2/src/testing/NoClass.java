
package testing;
import java.util.Scanner;

public class NoClass {

    public static void main(String args[]){

        System.out.println("Введите число : ");
        int palindrome = new Scanner(System.in).nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Число : " + palindrome
                    + " это палиндром");
        }else{
            System.out.println("Число : " + palindrome
                    + " не палиндром");
        }

    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;// копирование число в переменную
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;//извлечение последней цифры из числа
            reverse = reverse * 10 + remainder;// каждая следующая цифра из исходного числа
            // palindrome добавляется в обратное число reverse
            palindrome = palindrome / 10;//удаления последней цифры из числа palindrome,
            // так как мы уже использовали ее для нахождения цифры в обратном числе.
        }

        // если исходное и обратное число равны, значит
        // число является палиндромом
        if (number == reverse) {
            return true;
        }
        return false;
    }

}



