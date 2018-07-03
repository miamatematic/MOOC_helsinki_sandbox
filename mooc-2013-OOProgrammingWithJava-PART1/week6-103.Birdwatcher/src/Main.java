import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Birdwatcher mia = new Birdwatcher();
        System.out.print("? ");
        String word = doSomething(sc);
        
        
       while (!word.equals("Quit")){
           
           if (word.equals("Add")){
               System.out.print("Name: ");
               String name = doSomething(sc);
               
               System.out.print("Latin name: ");
               String latinName = doSomething(sc);
               System.out.println("");
               Bird bird = new Bird (name,latinName);
               mia.add(bird);
               
           }
           
           else if (word.equals("Observation")){
               System.out.print("What was observed:? ");
               word = doSomething(sc);
               
               
               int flag = 0; // ako u listi nemamo ptice s traženim imenom, ovo je nula
               for (Bird b : mia.getArray()){
                   if (b.getName().contains(word)){
                       b.observation();
                       flag = 1;
                       System.out.println(flag);
                   }
                    
               }
               if (flag == 0){
                       System.out.println("Is not a bird!");
                   }
           }
           
           else if (word.equals("Statistics")){
               mia.statistics();
           }
           
           else if (word.equals("Show")){
               System.out.println("What?");
               word = doSomething(sc);
               for (Bird b : mia.getArray()){
                if (b.getName().contains(word)){
                      mia.show(b);
                   }
               } 
           }
           
           System.out.print("? ");
           word = doSomething(sc);
           
           
            
        
        
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }
    }
    public static String doSomething(Scanner sc){
        String word = sc.nextLine();
        return word;
    }
}



    