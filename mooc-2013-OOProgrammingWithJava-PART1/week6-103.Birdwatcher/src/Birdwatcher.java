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

public class Birdwatcher {
  private  ArrayList <Bird> list;

    public Birdwatcher() {
        this.list = new ArrayList <Bird> ();
    }
    
    public void add (Bird newBird){
        this.list.add(newBird);
    }
    
    public void statistics (){
        for (Bird bird : list){
            System.out.println(bird);
        }
    }
    
    public void show (Bird bird){
        System.out.println(bird);
    }
    public ArrayList <Bird> getArray (){
        return this.list;
    }
    
  
}
