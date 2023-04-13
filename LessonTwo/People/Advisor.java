package People;
public class Advisor extends Employee{
    private int students;
    public Advisor(int age, String name, int employeeId, int students ) {
        super(age, name, employeeId);
        this.students = students;
    }
    public int getStudents() {
        return students;
    }
    public void setStudents(int students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return getName()+" is in charge of "+ students+ " students";
    }
    
    
}
