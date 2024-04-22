import java.util.ArrayList;
import java.util.List;

public class Ship extends Vehicle {
    private int capacity;
    private int speed;
    private int passengers;
    //private List<Passenger> passengers;

    public Ship(String name, String captainName, boolean hasLicense, int capacity, boolean hasRoutePermit, boolean hasSafetyEquipment, boolean hasProperTimeManagement,int speed,int passengers) {
        super(name, captainName, hasLicense, hasRoutePermit, hasSafetyEquipment, hasProperTimeManagement);
        this.capacity = capacity;
        this.speed = speed;
        this.passengers = passengers;
        //this.passengers = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean CrossLimits() {
        // Implement logic to check if passengers cross limits
        return speed > 100;// Placeholder, implement your logic
    }
    public boolean isOverCapacity() {
        return passengers > capacity;
    }

//    public boolean isOverCapacity() {
//        return passengers.size() > capacity;
//    }
//
//    public boolean addPassenger(Passenger passenger) {
//        if (!isOverCapacity()) {
//            passengers.add(passenger);
//            return true;
//        } else {
//            return false;
//        }
//    }
}
