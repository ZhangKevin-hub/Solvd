package Buildings;
public class Gym extends Location {
    public int equipment;

    public Gym(int floors, String address, int equipment) {
        super(address, floors);
        this.equipment = equipment;
    }
    @Override
    public void display(){
        System.out.println(
            "Gym is at " + getAddress() +
            " it has "+ getFloors() +" floors and " +
            equipment + " equipments.");
    }
}