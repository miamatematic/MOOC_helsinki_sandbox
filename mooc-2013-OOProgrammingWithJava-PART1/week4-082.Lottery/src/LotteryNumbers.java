import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
   

    public LotteryNumbers() {
      
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
       
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random rand = new Random();
        int i = 0;
        while(i < 7){
           int num = 1 + rand.nextInt(39); 
           if (!containsNumber(num)){
              this.numbers.add(num); 
              i++;
          }
        }
            
          
          
         
        
        
        
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)){
            return true;
        }
        // Test here if the number is already in the drawn numbers
        return false;
    }
}
