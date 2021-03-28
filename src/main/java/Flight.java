import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    public ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }


    public int getAmountOfPassengers() {
        return passengers.size();
    }

    public int availableSeats() {
        int seatsAvailable;
        seatsAvailable = (plane.getCapacity() - passengers.size());
        return seatsAvailable;
    }

    public void bookPassenger(Passenger passenger) {
        if (getAmountOfPassengers() < plane.getCapacity()) {
            passengers.add(passenger);
        }
    }

}
