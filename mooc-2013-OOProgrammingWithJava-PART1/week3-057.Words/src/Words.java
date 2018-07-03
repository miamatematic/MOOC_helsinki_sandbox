import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        while(true){
            if (word.isEmpty()){
                break;
            }
            words.add(word);
            
            System.out.println("Type a word: ");
            word = reader.nextLine();
        }
        System.out.println("You typed the following words: ");
        
        for (int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }
        
        
    }
}
