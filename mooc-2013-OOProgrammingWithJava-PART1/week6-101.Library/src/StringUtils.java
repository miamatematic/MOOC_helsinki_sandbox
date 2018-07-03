/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class StringUtils {

    public static boolean included(String word, String search) {
        if (word.isEmpty() || search.isEmpty()) {

            return false;
        }
        String temp1 = search.toUpperCase().trim();

        String temp2 = word.toUpperCase().trim();

        if (temp2.contains(temp1)) {
            return true;
        }

        return false;
    }
}
