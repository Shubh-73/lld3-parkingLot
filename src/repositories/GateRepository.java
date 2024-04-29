package repositories;

import exceptions.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    Map<Long, Gate> gateTable = new HashMap<>();

    public Map<Long, Gate> getGateTable() {
        return gateTable;
    }

    public void setGateTable(Map<Long, Gate> gateTable) {
        this.gateTable = gateTable;
    }


}
