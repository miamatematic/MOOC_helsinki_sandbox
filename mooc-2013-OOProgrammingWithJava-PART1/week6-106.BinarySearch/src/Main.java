
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] taulukko = {3,4};
        Scanner lukija = new Scanner(System.in);

        System.out.println("Numbers in the array " + Arrays.toString(taulukko));
        System.out.println();

        System.out.println("Enter searched number: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(taulukko, Integer.parseInt(etsittavaLuku));
        
        if (tulos){
            System.out.println("Value " + etsittavaLuku + " is in the array");
        }
        else{
            System.out.println("Value " + etsittavaLuku + " is not in the array");
        }
    }
}
