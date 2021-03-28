import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before() {
        flight = new Flight(Plane.JUMBOJET, "666", "SYD", "LHR", "8pm");
        plane = Plane.JUMBOJET;
        passenger1 = new Passenger("Claire", 3);
        passenger2 = new Passenger("Mark", 1);
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengers.size());
    }

    @Test
    public void canGetAvailableSeats() {
        assertEquals(1, flight.availableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight.bookPassenger(passenger1);
        assertEquals(1, flight.getAmountOfPassengers());
    }
}
