import java.util.ArrayList;
import java.lang.Math;

public class Variance {
    // Copy here sum from exercise 63 
  public static int sum(ArrayList<Integer> list) {
       int sum = 0;
       for (int i = 0; i < list.size(); i++){
           sum += list.get(i);
       }
        return sum;
    }  
    
    public static double average(ArrayList<Integer> list) {
        double res;
        res  = (double)sum(list)/list.size();
        return res;
    }

    public static double variance(ArrayList<Integer> list) {
        double res = 0;
        double av = average(list);
        
        for (int i = 0; i < list.size(); i++){
            
           
            res +=(list.get(i) - av)*(list.get(i)-av);
        } 
        return res/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
