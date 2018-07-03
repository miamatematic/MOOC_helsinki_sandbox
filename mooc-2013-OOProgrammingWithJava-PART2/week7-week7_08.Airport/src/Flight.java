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

public class Flight {
    private String planeId;
    private String departure;
    private String destination;
    
public Flight(String planeId, String departure, String destination){
    this.planeId = planeId;
    this.departure = departure;
    this.destination = destination; 
}
    public String getPlaneId(){
        return this.planeId;
    }
  
  public String toString (){
     
      return  " (" + this.departure + "-" + this.destination + ")";
   }
        
        
            
    }
    
    

