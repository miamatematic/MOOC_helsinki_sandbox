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


 public class Airport {
 
    private ArrayList <Airplane> planes;
    private ArrayList <Flight> flights;
 
 
    public Airport(){
        this.planes = new ArrayList <Airplane>();
        this.flights = new ArrayList <Flight> ();
  
    }
 
     public void addPlane (String id, int capacity){   //dodaje avion na listu svih aviona
        Airplane plane = new Airplane(id, capacity);
        this.planes.add(plane);
     
    }
 
 
    public void addFlight (String id, String departure, String destination){
        
         Flight flight = new Flight (id,departure,destination); 
        this.flights.add(flight);
      
    }
 
    public void printPlanes(){
        for (int i = 0; i < this.planes.size(); i++){
         System.out.println(this.planes.get(i));
     }
    
}

    public void printFlights (){
        for (int i = 0; i < this.flights.size(); i++){
            for (int j = 0; j < this.planes.size(); j++){
                if (this.planes.get(j).getId().equals(this.flights.get(i).getPlaneId())){
                 System.out.print(this.planes.get(j));
                }
            }
        
        System.out.println(this.flights.get(i));
            } 
    }
    
    public void printOnePlane (String id){
        for (int i = 0; i < this.planes.size(); i++){
            if (this.planes.get(i).getId().equals (id)){
             System.out.println(this.planes.get(i));
            }
        }
    }
  
}
