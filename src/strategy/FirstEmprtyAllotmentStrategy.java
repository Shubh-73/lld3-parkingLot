package strategy;

import exceptions.ParkingSpotUnavailableException;
import models.*;

public class FirstEmprtyAllotmentStrategy implements ParkingLotAllotmentStrategy{

    @Override
    public ParkingSpot getParkingSpot(VehicleType type, ParkingLot parkingLot) throws ParkingSpotUnavailableException {

        for(Floor floor: parkingLot.getFloorList()){

            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getStatus().equals(ParkingSpotStatus.AVAILABLE)){
                    return  spot;
                }
            }

        }

        System.out.println("Parking spot is not available");
        throw new ParkingSpotUnavailableException("Parking Lot is full");
    }
}
