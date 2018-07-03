
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class SortAgainstTotalPoints implements Comparator <Jumper> {

    @Override
    public int compare(Jumper t, Jumper t1) {
        return t1.getTotalPoints() - t.getTotalPoints();
    }

    
    }
    

