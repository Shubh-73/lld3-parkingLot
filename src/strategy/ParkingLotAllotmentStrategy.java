package strategy;

import exceptions.ParkingSpotUnavailableException;
import models.ParkingLot;
import models.ParkingSpot;
import models.VehicleType;

public interface ParkingLotAllotmentStrategy {

    ParkingSpot getParkingSpot(VehicleType type, ParkingLot parkingLot) throws ParkingSpotUnavailableException;
}
