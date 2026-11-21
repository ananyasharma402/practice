    
import java.util.*;

public class Sumcheck{
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            // Check if complement exists
            if (map.containsKey(complement)) {

                System.out.println("Pair found: " 
                    + complement + " + " + arr[i]);

                System.out.println("Indices: " 
                    + map.get(complement) + ", " + i);

                return;
            }

            // Store element and its index
            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}


