public class CabinCrewMember {

    private String name;
    private RankType rankType;

    public CabinCrewMember(String _name, RankType _rankType) {
        this.name = _name;
        this.rankType = _rankType;
    }

    public String hasName() {
        return name;
    }

    public RankType getRank() {
        return rankType;
    }

    public String relayMessage() {
        return "Enjoy your trip";
    }
}
