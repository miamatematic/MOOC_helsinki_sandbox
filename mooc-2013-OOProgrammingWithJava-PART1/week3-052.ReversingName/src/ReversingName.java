import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        String reverse = "";
        
        for(int i =name.length() -1; i >=0; i--){
            reverse += name.charAt(i);
        }
        
         System.out.println("In reverse order: " + reverse);
    }
}
