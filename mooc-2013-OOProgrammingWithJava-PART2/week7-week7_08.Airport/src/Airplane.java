/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String toString(){
        return this.id+ " (" + this.capacity + " ppl)";
    }
    
    public String getId(){
        return this.id;
    }
   
   
}
