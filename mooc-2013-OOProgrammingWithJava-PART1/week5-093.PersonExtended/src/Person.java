import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person (String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person (String name){
        this.name = name;
       this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
       
       int td = Calendar.getInstance().get(Calendar.DATE);
       int tm = Calendar.getInstance().get(Calendar.MONTH) + 1; 
       int ty = Calendar.getInstance().get(Calendar.YEAR);
       MyDate date = new MyDate (td,tm,ty);
       System.out.println(date);
       return this.birthday.differneceInYears(date);
       

    }
    
    public boolean olderThan(Person compared) {
        if (this.birthday.earlier(compared.birthday)){
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    
}
