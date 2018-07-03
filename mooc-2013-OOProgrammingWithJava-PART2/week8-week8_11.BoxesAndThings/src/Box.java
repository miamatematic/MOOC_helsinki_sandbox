/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.ArrayList;
public class Box implements ToBeStored  {
  private double maxWeight;
 
  private ArrayList <ToBeStored> things;
  
  public Box(double maxWeight){
      this.things = new ArrayList <ToBeStored> ();
     
      this.maxWeight = maxWeight;
    }
  
 public double weight() {
        double weight = 0;
        for (ToBeStored i  : this.things){
           weight += i.weight();
        }
        return weight;
    }
  
  public void add(ToBeStored thing){
      
      if (this.weight() + thing.weight() <= this.maxWeight){
          
          this.things.add(thing);
          System.out.println("bla");
         
      }
  }
  
    /**
     *
     * @return
     */
    @Override
  public String toString(){
     
      
      String s="Box: "+this.things.size()+" things, total weight "+ this.weight() + " kg";
      
      return s;
  }
  
  

 
        
    
}
