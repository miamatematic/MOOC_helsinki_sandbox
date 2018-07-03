public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(00, 17, 58);

        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}
/*When the clock was at the beginning, after  11:59:59, 2 ticks the expected time is 12:00:01, but the toString was: 13:00:01*/
