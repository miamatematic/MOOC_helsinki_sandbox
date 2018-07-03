
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Mikael");
        printWithSmileys("87.");
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys (String characterString){
        
        if (characterString.length() % 2 == 0){
            smileys(((characterString.length()+2)/2 + 2));
            System.out.println();
        
            smileys (1);
            System.out.print (" "+ characterString + " ");
            smileys (1);
             System.out.println("");
            smileys(((characterString.length()+2)/2 + 2));
            System.out.println();
        }
        else{
            smileys(((characterString.length()+ 3)/2 + 2));
            System.out.println();
        
            smileys (1);
            System.out.print ( " " + characterString + "  ");
            smileys (1);
             System.out.println("");
            smileys(((characterString.length()+ 3)/2 + 2));
            System.out.println();
        }
        
        
        
    }
    
    private static void smileys(int n){
      for (int i = 0; i < n; i++){
          System.out.print(":)");
      }  
    }

    }

    
    