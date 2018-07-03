/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.Random;
import java.lang.Math;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.height = height;
        this.width = width;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this.density = density;
        this.height = 10;
        this.width = 20;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.height = height;
        this.width = width;
        this.starsInLastPrint = 0;
    }

    public void printLine() {
        Random rnd = new Random();

        for (int i = 0; i < this.width; i++) {
            if (this.density == 1) {
                System.out.print("*");
            } 
            else {
                double random = rnd.nextDouble();
                random = Math.round(random * 10);

                if (this.density * 10 == random) {

                    System.out.print("*");
                    this.starsInLastPrint++;
                } else {
                    System.out.print(" ");
                }

            }

        }

    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            this.printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {

        return this.starsInLastPrint;
    }
}
