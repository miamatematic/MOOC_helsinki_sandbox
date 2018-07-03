import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList <Integer> list= new ArrayList <Integer>();
    
    public NumberStatistics(){
       this.amountOfNumbers = 0;
       this.list.clear();
    }
    
    public void addNumber(int number){
      this.amountOfNumbers ++; 
      this.list.add(number);
    }
    
    public int amountOfNumbers(){
        
      return this.amountOfNumbers;  
       
    }
    
    public int sum(){
        int sum = 0;
        for (int i = 0; i < this.list.size(); i++){
            sum += this.list.get(i);
        }
        return sum;
    }
    
    public double average(){
        double av = 0;
        if (amountOfNumbers()==0){
            return 0;
        }
        av = (double)this.sum()/amountOfNumbers();
        return av;
    }
}
