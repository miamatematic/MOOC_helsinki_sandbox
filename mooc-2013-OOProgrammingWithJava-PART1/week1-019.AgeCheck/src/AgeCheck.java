
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you? ");
        int years = Integer.parseInt(reader.nextLine());
        
        if (years >=0 && years <=120){
            System.out.println("OK");
        }
        else{
            System.out.println("Impossible!");
        }
    }
}
