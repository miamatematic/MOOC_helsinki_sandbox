
public class Main {

    public static void main(String[] args) {
        Person pekka = new Person("Sepe", new MyDate(29, 2, 2012));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}
