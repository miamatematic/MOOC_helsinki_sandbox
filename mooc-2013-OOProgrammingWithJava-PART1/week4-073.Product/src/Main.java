public class Main {
    public static void main(String[] args) {

       Person matti = new Person("Matti");
    Person john = new Person("John");

    matti.setHeight(180);
    matti.setWeight(86);

    john.setHeight(175);
    john.setWeight(64);

    System.out.println(matti.getName() + ", body mass index: " + String.format("%.2f" , matti.bodyMassIndex()));
    System.out.println(john.getName() + ", body mass index: " + String.format ("%.2f", john.bodyMassIndex()));
    
    }
    
     
}
