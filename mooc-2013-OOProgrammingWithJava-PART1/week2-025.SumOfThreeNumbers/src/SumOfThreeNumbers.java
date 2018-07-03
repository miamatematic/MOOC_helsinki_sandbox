
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        // store numbers read form user in this variable
        System.out.println("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        System.out.println("Type the third number: ");
        int num3 = Integer.parseInt(reader.nextLine());
        
        
        sum = num1 + num2 + num3;
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
