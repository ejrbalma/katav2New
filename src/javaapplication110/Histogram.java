package javaapplication110;

import java.util.HashMap;

public class Histogram <T> {

    private final T [] vector;

    public Histogram(T [] vector) {
        this.vector = vector;
    }

    public T [] getVector() {
        return vector;
    }
    
    public HashMap <T,Integer> getHistogram (){
        HashMap <T,Integer> map = new HashMap <>();
        for (int i = 0; i < vector.length; i++) {

            if (!map.containsKey(vector [i])) {
                map.put(vector[i], 0);
            }
            map.put(vector[i], map.get(vector[i])+1);
        }
        
        return map;
    }
}
