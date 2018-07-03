import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
        double average; 
        int even = 0;
        int odd = 0;
        
        while (num != - 1){
            sum += num;
            counter += 1;
            if (num%2 == 0){
                even += 1;
            }
            
            else{
                odd += 1;
            }
            num = Integer.parseInt(reader.nextLine());
            
            
        }
        
        average = (double)sum/(double)counter;
        
        System.out.println("Thank you and see you later!"); 
        System.out.println("The sum is " + sum); 
        System.out.println("How many numbers: " + counter); 
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        
        

    }
}
