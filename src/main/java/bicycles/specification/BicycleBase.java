package bicycles.specification;

public abstract class  BicycleBase  implements Bicycles {
   private int speed = 0;

    protected void changeSpeed(int speedChange) {
        speed += speedChange;
    }

    public int currentSpeed() {
        if(speed < 0){
            return 0;
        } else{

        }
        return speed;
    }

    public void stop() {
        speed = 0;
    }

}
