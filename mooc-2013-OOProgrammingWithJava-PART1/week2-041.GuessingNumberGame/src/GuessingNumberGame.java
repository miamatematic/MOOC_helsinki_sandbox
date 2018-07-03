
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        System.out.println("Guess a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int counter = 1;
        
        while (num != numberDrawn){
            if (num < numberDrawn){
                System.out.println("The number is greater, guesses made: " + counter);
            }
            else if (num > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + counter); 
            }
            
            
            System.out.println("Guess a number: ");
            num = Integer.parseInt(reader.nextLine());
            counter +=1; 
        }
        
        if (num == numberDrawn){
            
             System.out.println("Congratulations, your guess is correct!");
            
        }
        
        
        

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
