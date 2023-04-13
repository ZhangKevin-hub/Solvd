package People;
public class Teacher extends Employee {
    public String subject;
    public Teacher(int age, String name, int employeeId, String subject){
        super(age, name, employeeId);
        this.subject = subject;
    }
}
