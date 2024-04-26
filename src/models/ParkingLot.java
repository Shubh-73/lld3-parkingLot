package models;

import exceptions.ParkingSpotUnavailableException;
import strategy.ParkingLotAllotmentStrategy;

import java.util.List;

public class ParkingLot {

    int parkingLotId;
    List<Floor> floorList;
    List<Gate> gates;
    ParkingLotStatus parkingLotStatus;
    ParkingLotAllotmentStrategy parkingLotAllotmentStrategy;

    public ParkingLot(int parkingLotId, List<Floor> floorList, List<Gate> gates, ParkingLotStatus parkingLotStatus, ParkingLotAllotmentStrategy parkingLotAllotmentStrategy) {
        this.parkingLotId = parkingLotId;
        this.floorList = floorList;
        this.gates = gates;
        this.parkingLotStatus = parkingLotStatus;
        this.parkingLotAllotmentStrategy = parkingLotAllotmentStrategy;
    }

    public ParkingSpot getParkingSpot(VehicleType type) throws ParkingSpotUnavailableException {
        return parkingLotAllotmentStrategy.getParkingSpot(type, this);
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
