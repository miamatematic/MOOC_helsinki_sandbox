/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    
    public Person (String initialName){
        this.age = 0;
        this.name = initialName;
        this.height = 0;
        this.weight = 0;
    }
    public void setHeight(int newHeight){
        this.height = newHeight;
    }
    
    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public void printPerson(){
        System.out.println(this.name + "," + this.age);
    }
    
    public void becomeOlder(){
        this.age ++;
    }
    
    public int getAge(){
        return this.age;
    }
    public boolean isAdult(){
        if (this.age >= 18){
            return true;
        }
        return false;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", age " + this.age + " years";
    }
    
    public double bodyMassIndex(){
        double heightDividedByHundred = this.height/100.00;
        return this.weight/(heightDividedByHundred*heightDividedByHundred);
    }
}
