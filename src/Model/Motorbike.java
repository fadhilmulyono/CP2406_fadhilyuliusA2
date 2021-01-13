package Model;

public class Motorbike extends Vehicle {
    public Motorbike (String id, Road currentRoad) {
        super(currentRoad);
        this.id = ("motorbike_" + id);
        setLength(super.getLength() / 2);
        width = length / 2;
        position = -length;
    }
}