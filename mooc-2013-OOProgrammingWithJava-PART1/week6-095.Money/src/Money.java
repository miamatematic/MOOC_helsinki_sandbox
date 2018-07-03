
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        
        int c = this.cents + added.cents;
        int e = this.euros + added.euros();
        
        Money m = new Money(e,c);
        return m;
    }
    
    public boolean less (Money compared){
        if (this.euros < compared.euros){
            return true;
        }
        
        if (this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented){
        int e = 0;
        int c = 0;
        int res1 = this.cents + this.euros * 100;
        int res2 = decremented.cents + decremented.euros * 100;
       if (!this.less(decremented)){
           
           int res3 = res1 - res2;
           e = res3/100;
           c = res3%100;
           }
       else{
          c = 0;
          e = 0; 
       }
        
          Money m =new Money (e,c);
          return m;
       }
        
    
}
