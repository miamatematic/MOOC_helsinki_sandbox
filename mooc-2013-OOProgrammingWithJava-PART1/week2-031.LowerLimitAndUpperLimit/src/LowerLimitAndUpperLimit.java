
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int value1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int value2 = Integer.parseInt(reader.nextLine());
        
        for(int i = value1; i <= value2; i++){
            System.out.println(i);
        }

        // write your code here

    }
}
