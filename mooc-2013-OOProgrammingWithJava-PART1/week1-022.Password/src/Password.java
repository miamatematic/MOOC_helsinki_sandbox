
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";// Use carrot as password when running tests.
        System.out.println("Type the password:");
        String entry = reader.nextLine();
        
        if (entry.equals(password)){
            System.out.println("Right!");
            System.out.println("The secret is: Mia!");
        }
        else{
            System.out.println("Wrong!");
        }
        
        while (!entry.equals(password)){
            System.out.println("Type the password:");
            entry = reader.nextLine();
            if (entry.equals(password)){
            System.out.println("Right!");
            System.out.println("The secret is: Mia!");
        }
        else{
            System.out.println("Wrong!");
        }
        
        }
        
        
        
        // Write your code here
    }
}
