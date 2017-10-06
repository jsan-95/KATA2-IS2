package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram {
    private final int [] data;

    public Histogram() {
        this.data = new int[]{1, 1, 1, 100, 2, 4, 5, 6, 8, 8, 4, 5, 6, 2, -4};
    }
    
    public int[] getData() {
        return data;
    }
    
    Map getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i : getData()) {
            if(histogram.containsKey(i)){
                histogram.put(i, histogram.get(i)+1);
            }else{
                histogram.put(i, 1);
            }
        }
        return histogram;
    }
} 
