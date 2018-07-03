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

public class Phonebook {

    private ArrayList<Person> members;

    public Phonebook() {

        this.members = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person p = new Person(name, number);
        this.members.add(p);
    }

    public void printAll() {
        for (Person p : members) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name){
        for (Person p : members){
            if (p.getName().contains(name)){
                return p.getNumber();
            }
            
                
            
        }
        return "number not know";
}
    
    
}
