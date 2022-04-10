package Problem2;

import java.util.Arrays;
import java.util.HashMap;

public class KeypadArrangement {
    public static void main(String[] args) {
        int[] fre = {5, 2, 20, 9, 90};
        int[] keys = {2, 3};

        int res = minimalKeyStrokes(fre, keys);
        System.out.println(res);
        keys = new int[]{2, 3};
        fre = new int[]{5, 2, 20, 9, 90};
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        String arrangement = keyPadArrangement(fre, keys, letters);
        System.out.println(arrangement);
    }

    public static int minimalKeyStrokes(int[] frequencies, int[] keyLimits) {
        /**
         * Orders the frequency array in descending order
         */
        int[] temp = Arrays.copyOf(frequencies, frequencies.length);
        Arrays.sort(temp);
    
        for (int i = 0; i < frequencies.length; i++ ) {
            frequencies[i] = temp[temp.length - 1 - i];
        }

        /**
         * Counts key strokes
         */
        int minimalStrokes = 0;
        int currKeyIdx = 0;
        int completedKeys = 0;

        while (currKeyIdx < keyLimits.length) {
            for (int j = 0; j < keyLimits[currKeyIdx] && completedKeys < frequencies.length; j++) {
                int currFreqIdx = j * keyLimits.length + currKeyIdx;

                if (currFreqIdx >= frequencies.length) {
                    currFreqIdx = frequencies.length - 1;
                }

                minimalStrokes += ((j + 1) * frequencies[currFreqIdx]);
                completedKeys++;
            }

            currKeyIdx++;
        }

        return minimalStrokes;
    }

    public static String keyPadArrangement(int[] frequencies, int[] keyLimits, char[] letters) {
        /**
         * Makes a HashMap of frequencies and letters
         */
        HashMap<Integer, Character> freq = new HashMap<Integer, Character>();
        for (int i = 0; i < letters.length; i++) {
            freq.put(frequencies[i], letters[i]);   
        }

        /**
         * Orders the frequency array in descending order
         */
        int[] temp = Arrays.copyOf(frequencies, frequencies.length);
        Arrays.sort(temp);
        for (int i = 0; i < frequencies.length; i++ ) {
            frequencies[i] = temp[temp.length - 1 - i];
        }

        /**
         * Creates string for keypad arrangement
         */
        String result = "";
        int completedKeys = 0;
        int currKeyIdx = 0;
        while (currKeyIdx < keyLimits.length) {
            result += "[";
            for (int j = 0; j < keyLimits[currKeyIdx] && completedKeys < letters.length; j++) {
                int currFreqIdx = j * keyLimits.length + currKeyIdx;

                if (currFreqIdx >= frequencies.length) currFreqIdx = frequencies.length - 1;

                result += freq.get(frequencies[currFreqIdx]);
                completedKeys++;
            }

            result += "]";
            currKeyIdx++;
        }

        return result;
    }
}
