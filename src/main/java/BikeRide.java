import bicycles.Bicycles;

public class BikeRide {
    private int speed = 0;

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

//    Bicycles bicycles = new Bicycles();
//    BikeRide bikeRide = new BikeRide(bicycles);

    public BikeRide(Bicycles bicycles) {

    }
//
//    bikeRide.ride();

//System.out.println(bikeRide.currentSpeed())
}
