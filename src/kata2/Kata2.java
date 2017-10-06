package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {


    public static void main(String[] args) {
        Map<Integer,Integer> histogram = new HashMap<>();
        int [] array = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        for (int i : array) {
            if(histogram.containsKey(i)){
                histogram.put(i, histogram.get(i)+1);
            }else{
                histogram.put(i, 1);
            }
        }
        
        histogram.keySet().forEach((object) -> {
            System.out.println(object + "==>" + histogram.get(object));
        });
    }
    
}
