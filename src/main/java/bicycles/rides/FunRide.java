package bicycles.rides;

import bicycles.models.BicycleType;
import bicycles.specification.Bicycle;

import java.util.ArrayList;
import java.util.List;

public class FunRide{
    int maxBikes;
    int bikeCount=0;
    private List<Bicycle> bicycles = new ArrayList<>();

    public FunRide(int maxNumOfBikes){
        this.maxBikes = maxNumOfBikes;
    }

    public void accept(Bicycle bicycle){
         if (!bicycles.contains(bicycle) && maxBikes > bicycles.size()){
             bicycles.add(bicycle);
         }
    }

    public int getCountForType(BicycleType bicycleType){
        for (Bicycle i : bicycles){
            if (i.getBicycleType() == bicycleType){
                bikeCount ++;
            }
        }
           return bikeCount;
    }

    public int getEnteredCount(){
        return bicycles.size();
    }
}
