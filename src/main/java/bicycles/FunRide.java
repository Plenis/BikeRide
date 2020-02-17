package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide{
    private int bikeCount;
    int maxBikes;
    private List<Bicycles> bicycles = new ArrayList<>();

    public FunRide(int maxNumOfBikes){
        this.maxBikes = maxNumOfBikes;
    }

    public void accept(Bicycles bicycle){
         if (!bicycles.contains(bicycle) && maxBikes > bicycles.size()){
             bicycles.add(bicycle);
             System.out.println("Accepted");
         }
         else System.out.println("Rejected");
    }

    public int getCountForType(BicycleType bicycleType){
        for (Bicycles i : bicycles){
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
