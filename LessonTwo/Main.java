import Buildings.Dorm;
import Buildings.Gym;
import Buildings.Library;
import Buildings.StudentUnion;
import People.Advisor;
import People.Student;
import People.Teacher;

public class Main {
    public static void main(String[] args) {
        Dorm dorm1 = new Dorm("123 Main St", 4, 200, "Smith Hall");
        Gym gym1 = new Gym(2, "456 Broad St", 50);
        Library library1 = new Library(3, "789 Maple St", 50000);
        StudentUnion su1 = new StudentUnion("321 Oak St", 1, 1000);
        
        dorm1.display();
        gym1.display();
        library1.display();
        su1.display();
        
        Advisor adv1 = new Advisor(45, "John Smith", 1, 50);
        Student stu1 = new Student(45,"Bob bo",123);
        Teacher tea1 = new Teacher(35, "Alice Lee", 2, "Math");
        
        // call toString() method for Advisor class object
        System.out.println(adv1.toString());
    }
}
