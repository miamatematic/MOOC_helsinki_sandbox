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
public class Container {
    private int maxWeightLimit;
    private ArrayList <Suitcase> suitcases;
    private int suitcaseCounter;
    
    public Container (int max){
        this.maxWeightLimit = max;
        this.suitcases = new ArrayList<Suitcase>();
        this.suitcaseCounter = 0;
    }
    
     public int totalCweight(){
        int total = 0;
        for (int i = 0; i < this.suitcases.size(); i++){
            total += this.suitcases.get(i).totalWeight();
        }
        
        return total;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.totalCweight() + suitcase.totalWeight()  <= this.maxWeightLimit){
            this.suitcases.add(suitcase);
            this.suitcaseCounter ++;
        }
    }
    
    public String toString(){
        return String.valueOf(this.suitcaseCounter) + " suitcases (" + String.valueOf(this.totalCweight()) + " kg)";
        
    }
    
    public void printThings(){
        for (Suitcase suit : suitcases){
            suit.printThings();
        }
    }
        
    
    
    
   
}
