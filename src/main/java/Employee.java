public abstract class Employee {

    public static String name;
    public String rank;

    public Employee(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public static String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }
}
