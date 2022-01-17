import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = null;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public int pilotCount() {
        return this.pilots.size();
    }


    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public int cabinCrewCount() {
        return this.cabinCrew.size();
    }

    public int getPassengersCount() {
        return this.passengers.size();
    }

    public void addPlane(Plane plane){
        this.plane = plane;

    }

    public int getPlaneCapacity() {
        return this.plane.getGapacity();
    }

    public void addPassengers(Passenger passenger) {
        if (this.getPassengersCount() < getPlaneCapacity()) {
            this.passengers.add(passenger);
        }
    }

    public int getAvailableSeats() {
        return this.getPlaneCapacity() - this.passengers.size();
    }
}





