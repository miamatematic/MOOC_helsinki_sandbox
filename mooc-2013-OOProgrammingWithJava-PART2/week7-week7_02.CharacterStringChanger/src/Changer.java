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

public class Changer {
    ArrayList <Change> list;
    public Changer(){
        this.list = new ArrayList <Change> ();
    }
    
    public void addChange(Change change){
        this.list.add(change);
    }
    
    public String change(String characterString){
        for (int i = 0; i < this.list.size(); i++){
            characterString = this.list.get(i).change(characterString);
        }
        return characterString;
    }
}
