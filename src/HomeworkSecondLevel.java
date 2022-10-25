import java.util.Scanner;

public class HomeworkSecondLevel {

    public static void main(String[] args) {
        //С консоли считывается строка, если длина этой строки меньше 6 или последний
        // символ НЕ '!', тогда вывести "Ваш пароль неверный", иначе вывести "пароль принят"

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        int sizeOfLine = line.length();
        char lastSymbol = line.charAt(sizeOfLine - 1);

        if (sizeOfLine < 6 || lastSymbol != '!') {
            System.out.println("Ваш пароль неверный");
        }
        else {
            System.out.println("пароль принят");
        }


    }

}
