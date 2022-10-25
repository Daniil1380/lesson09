import java.util.Scanner;

public class HomeworkFirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("ошибок не обнаружено");
        }
        else {
            System.out.println("ERROR");
            System.out.println("ERROR");
            System.out.println("ERROR");
        }



        //С консоли считывается число. Если это число равно 0 - тогда напишите на экран
        // "ошибок не обнаружено", если число не равно 0, тогда выведите три сообщения "ERROR"

        //С консоли считывается строка, если эта длина этой строки меньше 6 или последний
        // символ НЕ '!', тогда вывести "Ваш пароль неверный", иначе вывести "пароль принят"


    }
}