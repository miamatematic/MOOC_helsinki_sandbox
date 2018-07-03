import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type exam scores, -1 completes:");
        Scanner lukija = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList <Integer> ();
        int num = doSomething(lukija);
        
        while (num != -1){
            if (num >= 0 && num <= 60){
                list.add(num);
            }
             
             num = doSomething(lukija);
        }
        System.out.println("Grade distribution");
        for (int i = 5; i >= 0; i--){
            System.out.print(i + ":");
            stars(brojac(i,list));
            System.out.println("");
        }
        
         System.out.println("Acceptance percentage:" + average(list)); 
        
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
    
    public static int doSomething (Scanner scanner){
        int num = Integer.parseInt(scanner.nextLine());
        return num;
    }
    
 public static int brojac (int grade, ArrayList <Integer> list){
     int counter = 0;
     
     for (int i: list){
         if (Grades.gradesAndPoints(i) == grade){
             counter ++;
         }
     }
     return counter;
 }
 
 public static void stars (int n){
     for (int i = 0; i < n; i++){
         System.out.print("*");
     }
 }
 
 /*public static int sum(ArrayList <Integer> list){
     int sum = 0;
     for (int i : list){
     sum += i;
     }
     return sum;
 }*/
 
 public static double average (ArrayList <Integer> list){
 
     int accepted = 0;
     
     for (int i= 1; i < 6; i++){
         accepted += brojac(i, list);
     }
     int all = accepted + brojac(0,list) + brojac(-1, list);
     System.out.println(accepted);
     System.out.println(all);
     /*42, 61, 15, -2*/
     
     return ((double)accepted/(double)all)*100;
 }

}
