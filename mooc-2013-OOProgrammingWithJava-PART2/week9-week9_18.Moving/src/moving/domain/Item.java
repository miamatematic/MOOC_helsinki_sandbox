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
public class Item implements Thing,Comparable <Item>{
    private String itemName;
    private int itemVolume;
    
    public Item (String itemName, int itemVolumen){
        this.itemName = itemName;
        this.itemVolume = itemVolumen;
    }
    
    @Override
    public int getVolume() {
        return this.itemVolume;
    }
    
    public String getName(){
        return this.itemName;
    }
    
    public String toString(){
        return this.itemName + " (" + this.itemVolume + " dm^3)";
    }

    @Override
    public int compareTo(Item t) {
         if (this.itemVolume > t.getVolume()){
             return 1;
         }
         else if (this.itemVolume < t.getVolume()){
             return -1;
         }
         return 0;
    }
}
