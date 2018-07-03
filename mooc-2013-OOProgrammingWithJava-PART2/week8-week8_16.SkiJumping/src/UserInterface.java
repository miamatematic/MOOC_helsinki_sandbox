/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



public class UserInterface {
    private Scanner sc;
    private ArrayList <Jumper> jumpers;
    
    public UserInterface(){
        this.sc = new Scanner(System.in);
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public void tournament(){
        /*turnir počinje*/
        System.out.println("Kumpula ski jumping week");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        System.out.print("  Participant name: ");
        String name = this.sc.nextLine();
        
        while (!name.equals("")){  /*sve dok ne stisne enter , učitava imena skakača*/
            
            System.out.print("  Participant name: ");
            Jumper jumper = new Jumper(name);
            
            this.jumpers.add(jumper);
            name = this.sc.nextLine();
        }
        
        if (name.equals("")){     /*Kada se stisne enter, kreću runde*/
            int counterOfRounds = 1;
            System.out.println("");
            System.out.println("The tournament begins!");
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = this.sc.nextLine();
            
            while (command.equals("jump")){
                System.out.println("");
                System.out.println("Round " + counterOfRounds);
                System.out.println("");
                
                round();
                System.out.println("Results of round " + counterOfRounds);
                results();
                counterOfRounds ++;
                System.out.print("Write \"jump\" to jump; otherwise you quit: ");
                command = this.sc.nextLine();
            }
            
            if (command.equals("quit")){
                System.out.println("Thanks!");
                tournamentResults();
            }
        
        }
    }
    
    public void round(){
        System.out.println("Jumping order:");
        Collections.sort(this.jumpers, new SortAgainstTotalPoints());
        Collections.reverse(jumpers);
        
        for (int i = 0; i < jumpers.size(); i++){
            System.out.println("  " + (i+1) +". " + jumpers.get(i).getName() + " (" + jumpers.get(i).getTotalPoints() + " points)");
        }
    }
    
    public void results(){
        
        for (int i = 0; i < jumpers.size(); i++){
            jumpers.get(i).setLengthOfJump();
            
            int length = jumpers.get(i).getLengthOfJump();
            
            
            ArrayList <Integer> votes = new ArrayList <Integer>();
            votes = jumpers.get(i).judgeVotes();
            System.out.println("  " + jumpers.get(i).getName());
            
            System.out.println("    length: " + length);
            System.out.println("    judge votes: " + votes);
            
            jumpers.get(i).totalPoints();
            
            
        }
       
    }
    
    public void tournamentResults(){
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers, new SortAgainstTotalPoints());
        
        for (int i = 0; i < jumpers.size(); i++){
            System.out.println((i+1) + "           " + jumpers.get(i).getName()
                    + " (" + jumpers.get(i).getTotalPoints() + " points)");
            System.out.print("             jump lengths:");
            jumpers.get(i).printJumps();
            
            
            System.out.println("");
            
        }
    }
    
    
         
}

    
    

