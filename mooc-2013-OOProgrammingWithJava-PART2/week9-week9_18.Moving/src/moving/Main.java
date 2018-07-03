package moving;
import moving.domain.Item;
import moving.domain.Thing;
import java.util.ArrayList;
import java.util.Collections;
import moving.domain.Box;
import moving.logic.Packer;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      List<Thing> things = new ArrayList<Thing>();
 things.add( new Item("Stone", 9) );
 things.add( new Item("Stone", 10) );
 things.add( new Item("Stone", 2) );
 things.add( new Item("Stone", 10) );
 things.add( new Item("Stone", 9) );
Packer packer = new Packer(20);
packer.packThings(things);



    // we ask our packer to pack things into boxes
    List<Box> boxes = packer.packThings( things );


 System.out.println("number of boxes: "+boxes.size());

    for (Box box : boxes) {
        System.out.println("  things in the box: "+box.getVolume()+" dm^3");
    }
        
    }
}
