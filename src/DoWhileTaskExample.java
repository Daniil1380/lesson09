import java.util.Scanner;

public class DoWhileTaskExample {

    public static void main(String[] args) {
        //Задача: с консоли вводятся значения температуры воздуха в корабле SpaceX.
        // Если введеное значение температуры будет меньше, чем -15, то прекратить ввод новых чисел
        //и написать на экране "разгерметизация, пилоты погибли"

        //Задача hard: с консоли вводятся строки - имена пилотов SpaceX. Как только будет написано "рассчет окончен",
        //завершить ввод строк. Вывести на экран количество пилотов

        //Задача super puper hard: Усложнение прошлой задачи, нужно найти пилота с самым длинным именем
        //посчитайте сумму чисел, которые будут введены с консоли. Если сумма покупок стала больше 1000 евро, выдать "Отказ"
        //20-52


        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            number = scanner.nextInt();
            sum += number; //sum = sum + number;
        } while (sum <= 1000);

        System.out.println("Отказ: " + sum);

    }
}