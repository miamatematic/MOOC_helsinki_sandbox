
import java.util.Scanner;
import java.lang.Math;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int rez = 0;
        int n = Integer.parseInt(reader.nextLine());
        
        for (int i =0; i <= n; i++){
            int pom = (int) Math.pow(2,i); 
            rez += pom;
        }
        System.out.println("The result is: " + rez);
    }
}
