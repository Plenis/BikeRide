package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide{
    int maxBikes;
    private List<Bicycles> bicycles = new ArrayList<>();

    public FunRide(int maxNumOfBikes){
        this.maxBikes = maxNumOfBikes;
    }

    public void accept(Bicycles bicycle){
         if (!bicycles.contains(bicycle) && maxBikes > bicycles.size()){
             bicycles.add(bicycle);
             System.out.println("Bike Accepted");
         }
         else System.out.println("Bike Rejected");
    }

    public int getCountForType(BicycleType bicycleType){
         int bikeCount=0;

        for (Bicycles i : bicycles){
            if (i.getBicycleType() == bicycleType){
                bikeCount ++;
                System.out.println(bikeCount);
            }
        }
           return bikeCount;
    }

    public int getEnteredCount(){
        return bicycles.size();
    }
}
