
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        String res = "";
        
        System.out.println("Length of the first part: ");
        int part = Integer.parseInt(reader.nextLine());
        
        for (int i = 0; i < part; i++){
            res += word.charAt(i);
        }
        
        System.out.println("Result: " + res);
        
    }
}
