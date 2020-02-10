package bicycles.models;

import bicycles.Bicycles;

public class MountainBike implements Bicycles {
    private int speed=0;

    public void acceleration() {
        speed += 5;

    }

    public void brake(){
        speed -= 3;
    }

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed = 0;
    }
}
