package repositories;

import models.Vehicle;
import models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String, Vehicle> vehicleTable = new HashMap<>();

    public Vehicle createVehicle(String vehicleNumber, VehicleType type, String ownerName){
        Vehicle vehicle = new Vehicle(vehicleNumber, type, ownerName);
        vehicleTable.put(vehicleNumber, vehicle);
        return vehicle;
    }

    public Vehicle getVehicleById(String id){
        return vehicleTable.get(id);
    }
}
