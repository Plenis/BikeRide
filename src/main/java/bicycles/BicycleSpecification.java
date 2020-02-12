package bicycles;

public class BicycleSpecification {
    private int brakeSpeed;
    private int accelerationSpeed;
    Object bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }


    public int getBrakeSpeed(){
        return brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return (BicycleType) bicycleType;
    }
}