package Problem1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class LuckyBet {
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 0);
        hm.put(2, 0);
        hm.put(3, 0);
        hm.put(4, 0);
        hm.put(5, 0);
        hm.put(6, 0);

        for (int i = 0; i < 100; i++) {
            int val = rand.nextInt(6) + 1;
            hm.put(val, hm.get(val) + 1);
        }

        printHashMap(hm);
    }

    public static void printHashMap(HashMap hm) {
        
        // System.out.println(hm);

        for (Integer i = 1; i < 7; i++) {
            Integer val = (Integer) hm.get(i);
            System.out.println("The number " + i + " occurs " + val + " times.");
        }
    }
}
