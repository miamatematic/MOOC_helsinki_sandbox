
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        System.out.println("Student name:");
        String name = reader.nextLine();

        while(!name.isEmpty()) {
            System.out.println("Studentnumber:");
            String num = reader.nextLine();
            Student st = new Student(name, num);

            list.add(st);

            System.out.println("Student name:");
            name = reader.nextLine();
        }
        
        for (Student students: list){
            System.out.println(students);
        }
        System.out.println("Give search term:");
        String sr = reader.nextLine();
        System.out.println("Result:");
       for (Student st: list){
           if (st.getName().contains(sr)){
               System.out.println(st);
           }
       }

    }
}
