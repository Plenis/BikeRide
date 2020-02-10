package bicycles;

public abstract class  BicycleBase  implements Bicycles {
   private int speed;

    protected void changeSpeed(int speedChange) {
        speed += speedChange;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
        speed = 0;
    }

}
