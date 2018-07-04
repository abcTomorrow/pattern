package strategy;

public enum VehicleType {
    BUS(new Bus()), CAR(new Car()), AIR_PLANE(new AirPlane());

    private Vehicle vehicle;

    VehicleType(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle get() {
        return vehicle;
    }

}
