package javaapplication110;

import java.util.HashMap;

public class Histogram {

    private final int [] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }
    
    public HashMap <Integer,Integer> getHistogram (){
        HashMap <Integer,Integer> map = new HashMap <>();
        for (int i = 0; i < vector.length; i++) {

            if (!map.containsKey(vector [i])) {
                map.put(vector[i], 0);
            }
            map.put(vector[i], map.get(vector[i])+1);
        }
        
        return map;
    }
}
