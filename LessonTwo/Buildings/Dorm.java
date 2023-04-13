package Buildings;
public class Dorm extends Location{
    public int rooms;
    public String buildingName;
    public Dorm(String address, int floors, int rooms, String name) {
        super(address, floors);
        this.rooms = rooms;
        this.buildingName = name;
    }
    @Override
    public void display(){
        System.out.println(buildingName + " has " + rooms + " rooms!");
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public String getBuildingName() {
        return buildingName;
    }
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}
