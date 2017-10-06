package kata2;

import java.util.Map;


public class Kata2 {


    public static void main(String[] args) {
        Histogram histo = new Histogram();
        
        Map<Integer,Integer> histogr = histo.getHistogram();

        histogr.keySet().forEach((object) -> {
            System.out.println(object + "==>" + histogr.get(object));
        });
    }
    
}
