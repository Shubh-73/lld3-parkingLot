package models;

public class Vehicle {

    private String vehicleNumber;
    private VehicleType type;
    private  String ownerName;

    public Vehicle(String vehicleNumber, VehicleType type, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
