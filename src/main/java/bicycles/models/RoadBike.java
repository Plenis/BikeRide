package bicycles.models;

import bicycles.Bicycles;

public class RoadBike implements Bicycles {
    private int speed = 0;


    public void acceleration() {
        speed += 11;
    }

    public void brake(){
        speed -= 4;
    }

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed = 0;
    }
}
