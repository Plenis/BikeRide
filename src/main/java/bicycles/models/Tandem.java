package bicycles.models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {

    public void acceleration() {
        changeSpeed(12);
    }

    public void brake(){
        changeSpeed(-7);
    }

}
