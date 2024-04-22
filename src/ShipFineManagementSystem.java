import java.util.Scanner;

public class ShipFineManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ship details
        System.out.println("Enter ship name:");
        String shipName = scanner.nextLine();

        System.out.println("Enter captain name:");
        String captainName = scanner.nextLine();

        System.out.println("Does the captain have a valid license? (true/false):");
        boolean hasLicense = scanner.nextBoolean();

        System.out.println("Enter ship capacity:");
        int capacity = scanner.nextInt();

        System.out.println("Enter The number of Passengers:");
        int passengers = scanner.nextInt();

        System.out.println("Enter ship speed: RECOMMENDED SPEED IS 100km/h");
        int speed = scanner.nextInt();

        System.out.println("Does the ship have a route permit? (true/false):");
        boolean hasRoutePermit = scanner.nextBoolean();

        System.out.println("Does the ship have safety equipment? (true/false):");
        boolean hasSafetyEquipment = scanner.nextBoolean();

        System.out.println("Does the ship have proper time management? (true/false):");
        boolean hasProperTimeManagement = scanner.nextBoolean();

        // Create ship object
        Ship ship = new Ship(shipName, captainName, hasLicense, capacity, hasRoutePermit, hasSafetyEquipment, hasProperTimeManagement,speed,passengers);

        // Input passenger details
//        System.out.println("Enter passenger name:");
//        String passengerName = scanner.next();
//
//        System.out.println("Enter passenger age:");
//        int passengerAge = scanner.nextInt();
//
//        System.out.println("Does the passenger have a ticket? (true/false):");
//        boolean hasTicket = scanner.nextBoolean();
//
//        // Create passenger object
//        Passenger passenger = new Passenger(passengerName, passengerAge, hasTicket);
//
//        // Add passenger to the ship
//        if (ship.addPassenger(passenger)) {
//            System.out.println("Passenger added successfully!");
//        } else {
//            System.out.println("Ship is already at full capacity!");
//        }
        int count = 0;
        // Check criteria for fines
        System.out.println("Criteria for fines:");

        if (!ship.hasValidCaptainLicense()) {
            System.out.println("- No valid captain license");
            ++count;
        }

        if (ship.CrossLimits()) {
            System.out.println("- Passengers crossed limits");
            ++count;
        }

        if (ship.isOverCapacity()) {
            System.out.println("- Ship is over capacity");
            ++count;
        }

        if (!ship.hasRoutePermit()) {
            System.out.println("- No route permit");
            ++count;
        }

        if (!ship.hasSafetyEquipment()) {
            System.out.println("- No safety equipment");
            ++count;
        }

        if (!ship.hasProperTimeManagement()) {
            System.out.println("- Improper time management");
            ++count;
        }
        System.out.println("The number of fines is: "+count);
        scanner.close();
    }
}
