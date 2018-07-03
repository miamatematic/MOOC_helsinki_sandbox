/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Mia
 */
import java.util.ArrayList;
import moving.domain.Item;
public class Box implements Thing{
    private int maximumCapacity;
    private ArrayList <Thing> box;
    
     public Box(int maximumCapacity){
         this.maximumCapacity = maximumCapacity;
         this.box = new ArrayList <Thing> ();
     }
     
     public boolean addThing(Thing thing){
         
         if (thing.getVolume() + this.getVolume() <= this.maximumCapacity){
             
             this.box.add(thing);
             return true;
         }
         return false;
     }

    @Override
    public int getVolume() {
        int capacity = 0;
         for (Thing t: this.box){
             capacity += t.getVolume();
         }
         return capacity;
    }
}
