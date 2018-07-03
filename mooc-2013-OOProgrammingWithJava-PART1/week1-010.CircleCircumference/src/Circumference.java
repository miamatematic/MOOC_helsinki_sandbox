
import java.util.Scanner;
import java.lang.Math;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        
        double circle = 2 * radius * Math.PI;
        
        System.out.println("Circumference of the circle: " + circle);
        // Program your solution here 
    }
}
