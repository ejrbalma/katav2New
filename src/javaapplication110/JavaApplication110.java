package javaapplication110;

import java.util.HashMap;

public class JavaApplication110 {

    public static void main(String[] args) {

        

        //Integer  [] vector = {1, 3, 1, 4, 5, 3, 1, 1, 7, 8,7};
        // Double [] vector = {1.3, 3.3, 1.3, 4.4, 5.5, 3.3, 1.1, 1.3, 7.1, 8.2, 7.1};
         String [] vector = {"Ana", "Elena", "Yaiza","Elena", "Yaiza","Elena", "Yaiza","Elena"};        

        Histogram histo = new Histogram(vector);
        
        HashMap <Object,Integer> histogram = histo.getHistogram();
    
        for (Object key : histogram.keySet()) {
            System.out.println(key+ " --> "+ histogram.get(key));    
        }
        
        
    
    }
    
}
