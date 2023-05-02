package Buildings;

public abstract class Location {
    private String address;
    private int floors;

    public Location(String address, int floors) throws InvalidAddressException, InvalidFloorNumberException {
        setAddress(address);
        setFloors(floors);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws InvalidAddressException {
        if (address == null || address.trim().isEmpty()) {
            throw new InvalidAddressException("Address cannot be empty or null.");
        }
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) throws InvalidFloorNumberException {
        if (floors <= 0) {
            throw new InvalidFloorNumberException("Number of floors must be greater than zero.");
        }
        this.floors = floors;
    }

    public void display() {
        System.out.println(address + " " + floors);
    }
}
