package kata2;

import java.util.HashMap;
import java.util.Map;


public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T,Integer> getHistogram(){
        Map<T,Integer> histogram = new HashMap<>();
        for (T i : getData()) {
            if(histogram.containsKey(i)){
                histogram.put(i, histogram.get(i)+1);
            }else{
                histogram.put(i, 1);
            }
        }
        return histogram;
    } 
} 
