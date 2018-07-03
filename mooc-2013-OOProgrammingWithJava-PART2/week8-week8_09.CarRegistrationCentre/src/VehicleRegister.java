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
public class VehicleRegister {
    
    
    private HashMap<RegistrationPlate, String> vehicleRegister;
    
    public VehicleRegister(){
        this.vehicleRegister = new HashMap<RegistrationPlate, String> ();
        
    }
    public boolean add(RegistrationPlate plate, String owner){
        if (owner == null){
            return false;
        }
        
        if (this.vehicleRegister.containsKey(plate) ){
            return false;
        }
        
        this.vehicleRegister.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
       for (RegistrationPlate i : this.vehicleRegister.keySet()){
           if (i.equals(plate)){
               return this.vehicleRegister.get(i);
           }
       }
       return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if (!this.vehicleRegister.containsKey(plate)){
            return false;
        }
        this.vehicleRegister.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate i : this.vehicleRegister.keySet()){
            System.out.println(i);
        }
    }
    
   public void printOwners(){
       ArrayList printedOwners = new ArrayList <String>();
       String soFar = "";
       
       for (RegistrationPlate i : this.vehicleRegister.keySet()){
           soFar = this.vehicleRegister.get(i);
           if (!printedOwners.contains(soFar)){
               System.out.println(this.vehicleRegister.get(i));
               printedOwners.add(soFar);
           }
                
            
            
        }
   }
}

