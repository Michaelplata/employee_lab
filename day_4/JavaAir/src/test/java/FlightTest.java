import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight("FR7922", "Edinburgh", "Gdansk", "14.35");
        pilot = new Pilot("Andrew", RankType.CAPTAIN, "SA123");
        cabinCrewMember1 = new CabinCrewMember("John", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Agnes", RankType.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Oli", 1);
        passenger2 = new Passenger("Daniel", 2);
        passenger3 = new Passenger("Paula", 2);
        passenger4 = new Passenger("Marcel", 0);
        plane = new Plane(PlaneType.AIRBUS220);
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR7922", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("Edinburgh", flight.getDestination());
    }

    @Test
    public void hasDeparture() {
        assertEquals("Gdansk", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("14.35", flight.getDepartureTime());
    }

    @Test
    public void canAddPilot() {
        flight.addPilot(pilot);
        assertEquals(1, flight.pilotCount());
    }

    @Test
    public void canAddCabinCrew() {
        flight.addCabinCrew(cabinCrewMember1);
        flight.addCabinCrew(cabinCrewMember2);
        assertEquals(2, flight.cabinCrewCount());
    }

    @Test
    public void canAddPassengers() {
        flight.addPlane(plane);
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flight.addPassengers(passenger4);
        assertEquals(4, flight.getPassengersCount());
    }

    @Test
    public void canReturnAvailableSeats() {
        flight.addPlane(plane);
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(143, flight.getAvailableSeats());
    }
}