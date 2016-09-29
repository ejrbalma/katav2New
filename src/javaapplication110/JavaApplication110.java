package javaapplication110;

import java.util.HashMap;
import static javafx.scene.input.KeyCode.T;

public class JavaApplication110 {

    public static void main(String[] args) {

        

        //Integer  [] vector = {1, 3, 1, 4, 5, 3, 1, 1, 7, 8,7};
        // Double [] vector = {1.3, 3.3, 1.3, 4.4, 5.5, 3.3, 1.1, 1.3, 7.1, 8.2, 7.1};
         String [] vector = {"Ana", "Elena", "Yaiza","Elena", "Yaiza","Elena", "Ana","Ana","Yaiza","Elena"};        

         Histogram<Object> histogram = CalculateHistogram.computeHistogram(vector);
    
        for (Object key : histogram.keySet()) {
            System.out.println(key+ " --> "+ histogram.get(key));    
        }
        
        
    
    }
    
}
