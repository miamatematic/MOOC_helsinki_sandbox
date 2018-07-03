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
public class Team {
    private String name;
    private ArrayList <Player> members;
    private int maxSize;
    
    public Team (String name){
        this.name = name;
        this.members = new ArrayList <Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player p){
        if (this.members.size() < this.maxSize){
            this.members.add(p);
        }
        
    }
    
    public void printPlayers(){
        for (Player p : members){
            System.out.println(p);
        }
    }
    
    public void setMaxSize(int max){
        this.maxSize =max;
        
    }
    
    
    public int size(){
        return this.members.size();
    }
    
    public int goals (){
        int sum = 0;
        for (Player p : this.members){
            sum += p.goals();
        }
        return sum;
    }
}
