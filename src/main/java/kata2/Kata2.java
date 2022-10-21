package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {2, 5, 6, 4, 6, 7, 4, 9 ,8 ,6 ,8 ,1, 2, 5, 3};
        
        Histogram histogram = new Histogram(data);
        
        Map<Integer,Integer> histogr = histogram.getHistogram();
        
        for (Object key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}
