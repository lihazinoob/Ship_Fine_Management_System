public class Vehicle {
    protected String name;
    protected String captainName;
    protected boolean hasLicense;
    protected boolean hasRoutePermit;
    protected boolean hasSafetyEquipment;
    protected boolean hasProperTimeManagement;

    public Vehicle(String name, String captainName, boolean hasLicense, boolean hasRoutePermit, boolean hasSafetyEquipment, boolean hasProperTimeManagement) {
        this.name = name;
        this.captainName = captainName;
        this.hasLicense = hasLicense;
        this.hasRoutePermit = hasRoutePermit;
        this.hasSafetyEquipment = hasSafetyEquipment;
        this.hasProperTimeManagement = hasProperTimeManagement;
    }

    public boolean hasValidCaptainLicense() {
        return hasLicense;
    }

    public boolean hasRoutePermit() {
        return hasRoutePermit;
    }

    public boolean hasSafetyEquipment() {
        return hasSafetyEquipment;
    }

    public boolean hasProperTimeManagement() {
        return hasProperTimeManagement;
    }
}
