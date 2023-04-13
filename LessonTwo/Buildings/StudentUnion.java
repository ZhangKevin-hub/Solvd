package Buildings;
public class StudentUnion extends Location{
    public int members;
    public StudentUnion(String address, int floors, int members) {
        super(address, floors);
        this.members = members;
    }
    @Override
    public void display(){
        System.out.println(
            "Student Union is at " + getAddress() +
            " it has "+ getFloors() +" floors and " +
            members + " members.");
    }
}
