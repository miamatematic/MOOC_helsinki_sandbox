/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class Calculator {
    private Reader custom;
    private int counter;
    
    public Calculator(){
        this.custom = new Reader ();
        this.counter = 0;
    }
    public void start(){
        
        while(true){
            System.out.println("command: ");
            String command = custom.readString();
            
            if (command.equals("end")){
                break;
            }
            
            else if (command.equals("sum")){
                sum();
            }
            
            else if (command.equals("difference")){
                difference();
            }
            else if (command.equals("product")){
                product();
            }
            
        }
       statistics();
    }
    
    private void sum (){
        System.out.print("Value1: ");
        int value1 = this.custom.readInteger();
        System.out.print("Value2: ");
        int value2 = this.custom.readInteger();
        this.counter ++;
        int sum = value1 + value2;
        
        System.out.println("sum of the values " + sum);
        
    }
    
     private void product (){
        System.out.print("Value1: ");
        int value1 = this.custom.readInteger();
        System.out.print("Value2: ");
        int value2 = this.custom.readInteger();
        this.counter ++;
        int product = value1 *value2;
        System.out.println("product of the values " + product);
        
    }
     
     private void difference (){
        System.out.print("Value1: ");
        int value1 = this.custom.readInteger();
        System.out.print("Value2: ");
        int value2 = this.custom.readInteger();
        this.counter ++;
        int diference = value1 - value2;
        System.out.println("difference of the values " + diference);
        
    }
     
     private void statistics(){
         System.out.println ("Calculations done " + this.counter);
     }
}
