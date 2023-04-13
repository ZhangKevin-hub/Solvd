package People;
public class Employee extends Person {
    private int employeeId;

    public Employee(int age, String name, int employeeId) {
        super(age, name);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
