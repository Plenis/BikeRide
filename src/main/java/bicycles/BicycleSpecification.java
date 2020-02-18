package bicycles;

public class BicycleSpecification {
    BicycleType bicycleType;

    public BicycleSpecification(BicycleType bicycleType) {
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return bicycleType.getAcceleration();
    }


    public int getBrakeSpeed(){
        return bicycleType.getBrake();
    }

    public BicycleType getBicycleType(){
        return  bicycleType;
    }
}