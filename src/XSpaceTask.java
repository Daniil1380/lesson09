import java.util.Scanner;

public class XSpaceTask {

    public static void main(String[] args) {
        //Задача hard: с консоли вводятся строки - имена пилотов SpaceX. Как только будет написано "рассчет окончен",
        //завершить ввод строк. Вывести на экран количество пилотов

        //Задача super puper hard: Усложнение прошлой задачи, нужно найти пилота с самым длинным именем
        //посчитайте сумму чисел, которые будут введены с консоли. Если сумма покупок стала больше 1000 евро, выдать "Отказ"
        //20-52

        Scanner scanner = new Scanner(System.in);
        String str;

        String maxName = "";

        do {
            str = scanner.nextLine();
            if (str.length() > maxName.length() && !str.equals("рассчет окончен")) {
                maxName = str;
            }
        } while (!str.equals("рассчет окончен"));

        System.out.println("Самое длинное имя: " + maxName);
    }
}
