
import java.util.Arrays;

public class Longestprefix {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        // Handle empty array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);

        // Get first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Compare characters
        for (int i = 0; i < first.length(); i++) {

            if (i >= last.length() || first.charAt(i) != last.charAt(i)) {
                break;
            }

            result.append(first.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String[] strs = {"club", "clap", "clove"};

        System.out.println(longestCommonPrefix(strs));
    }
}
