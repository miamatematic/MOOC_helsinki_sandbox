/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.Scanner;

public class Interface {

    private Scanner scanner;
    private Airport airport;

    public Interface(Scanner scanner, Airport airport) {
        this.scanner = scanner;
        this.airport = airport;
    }

    public void start() {
        System.out.print("Airport panel:");
        System.out.println("----------------------");
        System.out.println();
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");

        String command = this.scanner.nextLine();

        while (!command.equals("x")) {
            if (command.equals("1")) {
                this.addAirplane();
            }
            
            else if (command.equals("2")) {
                this.addFlight();
               
            }
            
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            command = this.scanner.nextLine();
        }
        
        
        
        if (command.equals("x")){
            
            System.out.println("");
            System.out.print("Flight service:");
            System.out.println("----------------------");
            System.out.println("");
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
        
            command = this.scanner.nextLine();
        
        
            while (!command.equals("x")){
                if (command.equals("1")){
                this.airport.printPlanes();
            
            }
        
            else if (command.equals("2")){
                 this.airport.printFlights();
            }
            else if (command.equals("3")){
            printPlaneInfo(); 
            }
                
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            command = this.scanner.nextLine();
            }
       
        }

    }

    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeId = this.scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.scanner.nextLine());
        this.airport.addPlane(planeId, capacity);

    }
    
    public void addFlight(){
       System.out.print("Give plane ID: ");
        String planeId = this.scanner.nextLine();
        System.out.print("Give departure airport code:  ");
        String departure = this.scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = this.scanner.nextLine();
        this.airport.addFlight(planeId, departure, destination);
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID:");
        String planeId = this.scanner.nextLine();
        this.airport.printOnePlane(planeId);
    }
}
/*AY - 123 (108 ppl)*/