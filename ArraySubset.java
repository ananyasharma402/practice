
import java.util.*;

public class ArraySubset {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Store frequency of large array
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check smaller array
        boolean isSubset = true;

        for (int num : arr2) {

            if (!map.containsKey(num) || map.get(num) == 0) {
                isSubset = false;
                break;
            }

            // Decrease frequency after using element
            map.put(num, map.get(num) - 1);
        }

        if (isSubset) {
            System.out.println("Subset");
        } else {
            System.out.println("Not a subset");
        }
    }
}


