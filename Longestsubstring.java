
import java.util.HashMap;

public class Longestsubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Check if character is already present
            if (map.containsKey(ch)) {

                left = Math.max(left, map.get(ch) + 1);
            }

            // Store character and its latest index
            map.put(ch, right);

            // Calculate current window length
            int len = right - left + 1;

            maxLen = Math.max(maxLen, len);
        }

        System.out.println("Longest substring length: " + maxLen);
    }
}

