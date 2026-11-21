
import java.util.*;

public class Freqhashmap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 2, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = -1;

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;
            }
        }

        System.out.println("Highest frequency element: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}
