/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Mia
 */
import java.util.Random;
public class Thermometer implements Sensor{

    @Override
    public boolean isOn() {
        
    }

    @Override
    public void on() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void off() {
        
    }

    @Override
    public int measure() {
        Random rnd = new Random();
        if (isOn()==true)
               
    }
    
}
