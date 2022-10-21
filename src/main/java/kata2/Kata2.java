package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {2, 5, 6, 4, 6, 7, 4, 9 ,8 ,6 ,8 ,1, 2, 5, 3};
        
        HashMap histogram = new HashMap<Integer, Integer>();
        
         for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], (int)histogram.get(data[i])+1);
            } else {
                histogram.put(data[i],1);
            }
        }
        for (Object key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
}
