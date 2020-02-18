package bicycles.specification;

import bicycles.models.BicycleType;

public interface Bicycle {

     void acceleration();
     void brake();
     int currentSpeed();
     void stop();
     BicycleType getBicycleType();

}
