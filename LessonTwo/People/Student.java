package People;
public class Student extends Person {
    private int studentID;

    public Student(int age, String name, int studentID) {
        super(age, name);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}