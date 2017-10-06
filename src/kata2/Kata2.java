package kata2;

import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        String [] data = {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        
        
        Map<String,Integer> histogr = histo.getHistogram();

        histogr.keySet().forEach((object) -> {
            System.out.println(object + "==>" + histogr.get(object));
        });
    }
    
}
