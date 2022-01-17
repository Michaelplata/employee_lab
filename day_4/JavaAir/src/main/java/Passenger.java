public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String _name, int _numberOfBags) {
        this.name = _name;
        this.numberOfBags = _numberOfBags;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
