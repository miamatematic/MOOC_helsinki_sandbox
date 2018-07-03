
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList <String> words = new ArrayList <String>();
        int i;
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        words.add(word);
        System.out.println("Type a word: ");
        word = reader.nextLine();
        
        while (true){
            if (words.contains(word)){
                break;
            }
            else{
                words.add(word);
                System.out.println("Type a word: ");
                word = reader.nextLine();
            }
        }
        System.out.println("You gave the word " + word + " twice");
            
            
           
            
            
            
       
        
        
       
        
    }
}
