
import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private Random random;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
// Initialize the variable
    }

    public String createPassword() {
        String password = "";
        
        for (int i = 0; i < this.length; i++) {
            int num = 1 + random.nextInt(22);
            char c = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            
            password += c;
            
        }
        return password;
    }
}
