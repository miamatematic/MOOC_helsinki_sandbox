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
public class Reader {
    private Scanner sc;
    public Reader(){
       this.sc = new Scanner (System.in); 
    }
    
    public String readString(){
        String newString = this.sc.nextLine();
        return newString;
    }
    
    public int readInteger(){
        int num = Integer.parseInt(this.sc.nextLine());
        return num;
    }
}
