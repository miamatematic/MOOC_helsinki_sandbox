/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class Grades {
    public static int gradesAndPoints(int points){
        if (points >=0 && points <= 29){
           return 0;
        }
        
        else if (points >= 30 && points <= 34){
            return 1;
        }
        
        else if (points >= 35 && points <= 39){
            return 2;
        }
        else if (points >= 40 && points <= 44){
            return 3;
        }
        else if (points >= 45 && points <= 49){
           return 4;
        }
        
        else if (points >= 50 && points <= 60){
            return 5;
        }
        
        return -1;
    }
}
