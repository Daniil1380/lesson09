import java.util.Scanner;

public class HomeworkMaximum {

    public static void main(String[] args) {
        //считываются числа, при вводе числа 0 считывание останавливается. Найдите макс. число

        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;  //-2_147_483_648
        int number;

        do {
            number = scanner.nextInt();
            if (number > maxNumber && (number != 0)) {
                maxNumber = number;
            }
        } while (number != 0);

        System.out.println(maxNumber);

        maxNumber = Integer.MAX_VALUE;  //-2_147_483_648
        do {
            number = scanner.nextInt();
            if (number < maxNumber && (number != 0)) {
                maxNumber = number;
            }
        } while (number != 0);

        System.out.println(maxNumber);



    }

}
