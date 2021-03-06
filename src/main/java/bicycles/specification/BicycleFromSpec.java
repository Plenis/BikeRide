package bicycles.specification;

import bicycles.models.BicycleType;

public class BicycleFromSpec extends BicycleBase {


    private final BicycleSpecification bikeSpec;

    public BicycleFromSpec(BicycleSpecification bikeSpec){
    this.bikeSpec = bikeSpec;
    }

    public void acceleration() {
    changeSpeed(this.bikeSpec.getAccelerationSpeed());
    }

    public void brake() {
   changeSpeed( this.bikeSpec.getBrakeSpeed());
    }

    public BicycleType getBicycleType() {
        return bikeSpec.bicycleType;
    }

}
