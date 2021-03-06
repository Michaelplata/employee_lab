public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getGapacity(){
        return this.planeType.getCapacity();
    }

    public int getTotalWeight(){
        return this.planeType.getTotalWeight();
    }
}
