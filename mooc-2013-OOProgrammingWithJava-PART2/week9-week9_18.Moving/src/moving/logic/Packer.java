/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author Mia
 */
import java.util.List;
import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import java.util.ArrayList;
public class Packer {
    private  int boxesVolume;
    private List <Integer> boxes;
    
    public Packer (int volume){
        this.boxesVolume = volume;
    }
    
     public List<Box> packThings(List<Thing> things){
             
         List <Box> boxes = new ArrayList <Box>();
        List <Box> copyOfBoxes = new ArrayList <Box>();
        
         Box box = new Box(this.boxesVolume);
         for (int i = 0; i < things.size(); i++){
             if (!box.addThing(things.get(i))){
                 boxes.add(box);
                 box = new Box (this.boxesVolume);
                 box.addThing(things.get(i));
             }
         }
         
         boxes.add(box);
        return boxes;
     }   
    
}
