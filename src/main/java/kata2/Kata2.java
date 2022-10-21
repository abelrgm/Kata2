package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String [] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};;
        
        Histogram histogram = new Histogram(data);
        
        Map<String,Integer> histogr = histogram.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}
