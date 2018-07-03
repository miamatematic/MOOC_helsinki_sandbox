
public class Main {

    public static void main(String[] args) {
       Suitcase m = new Suitcase(10);
       System.out.println(m.heaviestThing());
    }
    
    public static void addSuitcasesFullOfBricks (Container container){
       
        for (int i = 0; i < 100; i++){
            Thing brick = new Thing("Brick", i + 1);
            Suitcase suit = new Suitcase (i + 1);
            suit.addThing(brick);
            container.addSuitcase(suit);
        }
    }

}
