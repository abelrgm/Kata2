package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = {2, 5, 6, 4, 6, 7, 4, 9 ,8 ,6 ,8 ,1, 2, 5, 3};
        
        HashMap histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? (int)histogram.get(key) + 1 : 1);
        }
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
}
