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

public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
   public TextUserInterface(Scanner reader, Dictionary dictionary){
       this.reader = reader;
       this.dictionary = dictionary;
   }
   
   public void start(){
       System.out.println("Statment:");
       
       System.out.println("add - adds a word pair to the dictionary");
       System.out.println("translate - asks a word and prints its translation");
       System.out.println("quit - quits the text user interface");
           
       while (true){
          
          System.out.print("Statment:");
          String word = this.reader.nextLine();
          
          
          if (word.equals("quit") ){
              System.out.println("Cheers!");
              break;
          }
          
          else if (word.equals("add")){
              this.add();
          }
          
          else if (word.equals("translate")){
              this.translate();
          }
          else{
             System.out.println("Unknown statment"); 
          }
           System.out.println("");
          
       }
   }
   
   public void add(){
       System.out.print("In Finnish: ");
       String word1 = this.reader.nextLine();
       
       System.out.print("Translation: ");
       String word2 = this.reader.nextLine();
       
       this.dictionary.add(word1, word2);
   }
   
   public void translate(){
       System.out.print("Give a word: ");
       String word = this.reader.nextLine();
       System.out.println("Translation: " + this.dictionary.translate(word));
   }
}
