
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statseven = new NumberStatistics();
        NumberStatistics statsodd = new NumberStatistics();

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int num = Integer.parseInt(reader.nextLine());

        while (num != -1) {
            if (num % 2 == 0) {
                stats.addNumber(num);
                statseven.addNumber(num);

            } else {
                stats.addNumber(num);
                statsodd.addNumber(num);
            }

            num = Integer.parseInt(reader.nextLine());

        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statseven.sum());
        System.out.println("sum of odd: " + statsodd.sum());

        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
    }

}
