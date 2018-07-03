
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList <String> words = new ArrayList <String>();
        System.out.println("Type a word: ");
        String  word = reader.nextLine();
        
     while(true){
            if (word.isEmpty()){
                break;
            }
            words.add(word);
            
            System.out.println("Type a word: ");
            word = reader.nextLine();
        }
     System.out.println("You typed the following words:");
        
         Collections.sort(words);
        
        for (String i : words) {
        System.out.println( i );
        }
    }
}
