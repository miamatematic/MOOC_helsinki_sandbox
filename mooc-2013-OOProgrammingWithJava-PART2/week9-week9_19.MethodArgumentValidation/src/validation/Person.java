package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
        if (this.name == null || this.name.isEmpty() || this.name.length()>40){
              throw new IllegalArgumentException();
        }
        else if (this.age < 0 || this.age > 120){
             throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
