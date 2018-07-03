public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        MyDate m = new MyDate(this.day, this.month, this.year);
        int dif = 0;
        int res1 = m.month * 30 + m.year * 365 + m.day;
        int res2 = comparedDate.month * 30 + comparedDate.year * 365 + comparedDate.day;
        if (comparedDate.earlier(m)){
          dif = res1 - res2;
         
        }
        else{
           dif = res2 - res1;
        }
        
       return dif/365 ;
    }

}
