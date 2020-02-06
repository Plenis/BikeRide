package bicycles;

public class Bicycles {
    private int speed=0;

    public void accelerate(){
        speed += 5;
    }

    public void brake(){
        speed -= 5;
    }

    public int currentSpeed(){
        return speed;
    }

    public void stop(){
        speed = 0;
    }
}
