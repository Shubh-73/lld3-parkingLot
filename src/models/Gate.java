package models;

public class Gate {

    private int number;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;

    public Gate(int number, GateType gateType, Operator operator, GateStatus gateStatus) {
        this.number = number;
        this.gateType = gateType;
        this.operator = operator;
        this.gateStatus = gateStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
