/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;

    }

    public int value() {
        return this.number;
    }

    public Counter(int startingValue) {
        this.number = startingValue;
        this.check = false;

    }

    public Counter(boolean check) {
        this.number = 0;
        this.check = true;

    }

    public Counter() {
        this.number = 0;
        this.check = false;
    }

    public void increase() {
        this.number++;

    }

    public void decrease() {
        if (this.check == true) {
            if (this.number - 1 >= 0) {
                this.number--;
            }
        } else {
            this.number--;
        }

    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == true) {
                if (this.number - decreaseAmount >= 0) {
                    this.number -= decreaseAmount;
                }
                
                else{
                  this.number = 0;  
                }
            } else {
                this.number -= decreaseAmount;
            }
        }
    }

}
