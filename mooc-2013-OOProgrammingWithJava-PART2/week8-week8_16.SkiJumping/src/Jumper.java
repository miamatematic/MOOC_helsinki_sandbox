/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
public class Jumper {
    private String name;
    private int totalPoints;
    private int lengthOfJump;
    private Random rnd;
    private ArrayList <Integer> judgeVotes;
    private ArrayList <Integer> jumps;
    
    public Jumper(String name){
        this.name = name;
        this.totalPoints = 0;
        this.lengthOfJump = 0;
        this.rnd = new Random();
        this.judgeVotes = new ArrayList<Integer>();
        this.jumps = new ArrayList<Integer>();
    }
    
    public String getName (){
        return this.name;
    }
    
    public void setLengthOfJump(){
       this.lengthOfJump = 60 + this.rnd.nextInt(61);
       this.jumps.add(this.lengthOfJump);
    }
    
    public int getLengthOfJump(){
        return this.lengthOfJump;
    }
    
    public ArrayList <Integer> judgeVotes (){
        this.judgeVotes.clear();
        
        for (int i = 0; i < 5;  i++){
            int grade = 5 + this.rnd.nextInt(16);
            this.judgeVotes.add(grade);
          
        }
       
        return this.judgeVotes;
        
    }
    public void totalPoints(){
        
        int max = Collections.max(this.judgeVotes);
        int min = Collections.min(this.judgeVotes);
        int sumOfVotes = 0;
        
        for (int i = 0; i < this.judgeVotes.size(); i++ ){
            if (this.judgeVotes.get(i)== min){
               this.judgeVotes.remove(judgeVotes.get(i));
               break;
            }
        }
        
        for (int i = 0; i < this.judgeVotes.size(); i++ ){
            if (this.judgeVotes.get(i)== max){
               this.judgeVotes.remove(judgeVotes.get(i));
               break;
            }
        }
        
        for (int i = 0; i < this.judgeVotes.size(); i++ ){
            sumOfVotes += judgeVotes.get(i);
        }
        
        this.totalPoints += sumOfVotes + this.getLengthOfJump();
        
    }
    
    public void setTotalPoints (int i){
        this.totalPoints += i;
        
    }
    
    public int getTotalPoints(){
        return this.totalPoints;
        
    }
    
    public ArrayList<Integer> getJumps(){
        return this.jumps;
    }
    
    public void printJumps(){
        for (int i = 0; i < this.jumps.size()-1; i++){
            System.out.print(" " + this.jumps.get(i) + " m,");
        }
        System.out.print(" " + this.jumps.get(this.jumps.size()-1) + " m");
    }
    
}
