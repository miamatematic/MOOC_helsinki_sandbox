import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int fact = 1;
        
        if (number == 0 || number == 1){
            fact = 1;
        }
        
        else{
            for (int i = 1; i<= number; i++){
                fact *= i;
            }
        }
        
        System.out.println("Factorial is "+ fact);
    }
}
