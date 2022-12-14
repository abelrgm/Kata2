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
    
    public Map<Integer, Integer> getHistogram() {
        Map histogram = new HashMap<Integer, Integer>();
        
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? (int)histogram.get(key) + 1 : 1);
        }
        
        return histogram;
    }
}
