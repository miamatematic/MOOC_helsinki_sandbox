
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);

        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);

    }

    public void tick() {
        this.seconds.next();
        if (this.hours.getValue() == 23 && this.minutes.getValue() == 59 && this.seconds.getValue() == 0) {
            /*System.out.println( this.hours + ":" + this.minutes + ":" + this.seconds);*/
            this.hours.setValue(0);
            this.minutes.setValue(0);
            this.seconds.setValue(0);

        } else if (this.hours.getValue() == 0 && this.minutes.getValue() == 0 && this.seconds.getValue() == 0) {
            /*System.out.println( this.hours + ":" + this.minutes + ":" + this.seconds); */
            this.minutes.setValue(1);
            this.seconds.setValue(0);

        } else if (this.hours.getValue() == 0 && this.minutes.getValue() == 59 && this.seconds.getValue() == 0) {
            this.hours.setValue(1);
            this.minutes.setValue(0);
            this.seconds.setValue(0);
            
        } 
        
        else if (this.minutes.getValue() == 59 && this.seconds.getValue() == 0) {
            this.hours.next();
            this.minutes.setValue(0);
            this.seconds.setValue(0);
            
        } 
        
        else if (this.seconds.getValue() == 0){
           this.minutes.next(); 
        }
        
        
/*00:17:58, 2 ticks the expected time is 00:18:00, but the toString was: 00:17:00*/
        
    }

    public String toString() {

        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
