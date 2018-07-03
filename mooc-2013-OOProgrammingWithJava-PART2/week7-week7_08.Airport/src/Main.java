import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
         Scanner reader = new Scanner(System.in);
    Airport mia= new Airport();

    Interface i = new Interface(reader, mia);
    i.start();
    
    
    }
}
