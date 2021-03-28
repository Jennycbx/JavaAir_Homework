public enum Plane {

    BOEING747(2, 80.0),
    CROPDUSTER(1, 40.0),
    JUMBOJET(3, 100.0);

    public final int capacity;
    private final double totalWeight;

    Plane(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
