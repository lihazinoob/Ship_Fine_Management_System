public class Passenger {
    private String name;
    private int age;
    private boolean hasTicket;

    public Passenger(String name, int age, boolean hasTicket) {
        this.name = name;
        this.age = age;
        this.hasTicket = hasTicket;
    }

    // Encapsulation: Using private fields with public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean hasTicket() {
        return hasTicket;
    }
}
