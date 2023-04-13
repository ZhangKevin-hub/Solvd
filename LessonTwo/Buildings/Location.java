package Buildings;
public abstract class Location {
    private String address;
    private int floors;

    public Location(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void display(){
        System.out.println(address +" "+ floors);
    }
}