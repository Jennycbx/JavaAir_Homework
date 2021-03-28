public class CabinCrewMember extends Employee {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank.getRank());
    }

    public String relayMessageToPassengers(String message) {
        return message;
    }
}
