package bicycles.models;

public enum BicycleType{
    RoadBike(11, -4),
    MountainBike(5, -3),
    Tandem(12, -7);

    private int accelerationSpeed;
    private int brakeSpeed;

    BicycleType(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getAcceleration(){
        return this.accelerationSpeed;
    }


    public int getBrake(){
        return this.brakeSpeed;
    }
}

