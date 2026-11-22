import java.util.*;

 public class Sumcheckrep{
    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 5, 5};
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of elements
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : arr) {

            int complement = target - num;

            if (map.containsKey(num) && map.get(num) > 0) {

                // Check if complement is available
                if (map.containsKey(complement) && map.get(complement) > 0) {

                    // Avoid pairing an element with itself
                    if (num == complement && map.get(num) < 2) {
                        continue;
                    }

                    count++;

                    // Decrease frequency of both elements
                    map.put(num, map.get(num) - 1);
                    map.put(complement, map.get(complement) - 1);
                }
            }
        }

        System.out.println("Number of pairs: " + count);
    }
}

