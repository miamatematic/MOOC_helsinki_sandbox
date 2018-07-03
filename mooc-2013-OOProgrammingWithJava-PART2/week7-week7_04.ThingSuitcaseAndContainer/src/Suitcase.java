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

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWLimit;
    private int counter;

    public Suitcase(int maxWLimit) {
        this.maxWLimit = maxWLimit;
        this.things = new ArrayList<Thing>();
        this.counter = 0;
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWLimit) {
            this.things.add(thing);
            this.counter++;
        }

    }

    public int totalWeight() {
        int sum = 0;
        for (int i = 0; i < this.things.size(); i++) {
            sum += this.things.get(i).getWeight();
        }
        return sum;
    }

    public String toString() {

        if (this.counter == 0) {
            return "empty" + "(" + String.valueOf(this.totalWeight()) + " kg)";
        }
        
        else if (this.counter == 1){
            return String.valueOf(this.counter) + " thing(" + String.valueOf(this.totalWeight()) + " kg)";
        }

        return String.valueOf(this.counter) + " things(" + String.valueOf(this.totalWeight()) + " kg)";
    }

    public void printThings() {
        for (int i = 0; i < this.things.size(); i++) {
            System.out.println(this.things.get(i));
        }
    }

    public Thing heaviestThing() {
        Thing heavy = new Thing ("", 0) ;
        if (this.things.size() != 0){
           heavy = this.things.get(0);
           
           for (int i = 0; i < this.things.size(); i++){
               if (heavy.getWeight() < this.things.get(i).getWeight()){
                   heavy = this.things.get(i);
               }
           }
           return heavy;
        }
       return null;
    }

}
