
import java.util.Scanner;
import java.lang.Math;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        double num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        double num2 = Integer.parseInt(reader.nextLine());
        
        double bigger = Math.max(num2, num1);
        System.out.println("The bigger number of the two numbers given was: " + bigger);
        // Implement your program here. Remember to ask the input from user
    }
}
