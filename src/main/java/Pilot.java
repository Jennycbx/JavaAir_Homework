public class Pilot extends Employee {

    private String licenseNumber;

    public Pilot(String name, String licenseNumber, Rank rank) {
        super(name, rank.getRank());
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String flyPlane(String message) {
        return message;
    }
}
