import java.util.Random;

public class WhileExample {

    public static void main(String[] args) {

        //while - это цикл без известного количества повторений
        Random random = new Random();
        int x = random.nextInt();
        long count = 0;

        //while - сначала проверяет условие, потом делает
        //do while - сначала делает, потом проверяет условие

        while (x != 0) {
            x--;
            count++;
        }

        System.out.println(count);



    }

}
