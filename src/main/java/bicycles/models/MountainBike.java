package bicycles.models;

import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

    public void acceleration() {
        changeSpeed(5);
    }

    public void brake(){
        changeSpeed(-3);
    }

}
