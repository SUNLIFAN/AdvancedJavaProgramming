package S201250181;

import java.util.Random;

public class RandomGenerator {
    public static Color[] generateColor(int num){
        Random ran = new Random();
        Color[] colors = new Color[num];
        for(int i = 0; i < num; i ++){
            int r = ran.nextInt(256);
            int g = ran.nextInt(256);
            int b = ran.nextInt(256);
            colors[i] = new Color(r, g, b);  
        }

        return colors;
    }
    
}
