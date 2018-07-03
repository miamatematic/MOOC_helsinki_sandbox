public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initial;
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = valueAtStart;
    }
    
    
    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value--;
        
        if (value <= 0){
            value = 0;
        }
    }
    
    public void reset(){
        this.value = 0;
    }

    public void setInitial(){
        this.value = this.initial;
    }
}
