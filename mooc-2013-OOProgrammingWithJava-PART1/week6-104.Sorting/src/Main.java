import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(values));
        sort(values);

  
    }

    
    public static int smallest(int[] array){
        int minSoFar = array[0];
        for (int i =1; i < array.length; i++){
            if (minSoFar > array[i]){
                minSoFar = array[i];
            }
        }
        
    return minSoFar;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int index = 0;
        int min = smallest(array);
        
        for (int i =0; i < array.length; i++){
           if (min == array[i]){
              index = i; 
           } 
        }
        return index;
    }
    
   public static int indexOfTheSmallestStartingFrom(int[] array, int start){
       int index = start;
       int minSoFar = array[start];
      
       for (int i = start + 1; i < array.length; i++){
           if (minSoFar > array[i]){
               minSoFar = array[i];
               index = i;
           }
           
       }
      return index; 
   }
   
   public static void swap(int[] array, int index1, int index2){
       int temp = array[index1];
       array[index1] = array[index2];
       array[index2] = temp;
       
       
   }
   
   public static void sort(int[] array){
       for (int i = 0; i < array.length - 1; i++){
           int temp = indexOfTheSmallestStartingFrom(array, i);
           swap(array, i,temp);
           System.out.println(Arrays.toString(array));

       }
   }
}
