package bicycles.models;

import bicycles.BicycleBase;
import bicycles.Bicycles;

public class RoadBike extends BicycleBase {

    public void acceleration() {
       changeSpeed(11);
    }

    public void brake(){
        changeSpeed(-4);
    }
}
