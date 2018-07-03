
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        
        System.out.println("Number of characters: " + name.length());
        // call your method from here
    }
    
    
    public static int calculateCharacters(String text){
        int len = text.length();
        return len;
    }
    
}
