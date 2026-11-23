
    import java.util.*;
    public class Sumsubarray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        HashSet<Integer> set = new HashSet<>();

        int sum = 0;

        set.add(0);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (set.contains(sum - target)) {
                System.out.println("Subarray found");
                return;
            }

            set.add(sum);
        }

        System.out.println("Subarray not found");
    }
}

