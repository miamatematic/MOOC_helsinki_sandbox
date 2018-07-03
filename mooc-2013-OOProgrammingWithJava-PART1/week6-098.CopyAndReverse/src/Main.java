import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reversed = reverseCopy(original);
        
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reversed));
    }

    public static int[] copy(int[] array) {
        int[] cpy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            cpy[i] = array[i];
        }
        return cpy;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] rev = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--){
            rev[i] = array[j];
            j++;
        }
        return rev;
    }

}
