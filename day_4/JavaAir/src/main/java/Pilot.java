public class Pilot {
    private String name;
    private RankType rankType;
    private String licenceNumber;

    public Pilot(String _name, RankType _rankType, String _licenceNumber) {
        this.name = _name;
        this.rankType = _rankType;
        this.licenceNumber = _licenceNumber;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rankType;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane(){
        return "Fasten your seatbelt please";
    }
}
