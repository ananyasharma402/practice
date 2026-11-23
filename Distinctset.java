import java.util.*;

public class Distinctset {
    public static void main(String[] args) {

        String s = "abac";

        HashMap<Character, Integer> map = new HashMap<>();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {

                count++;
                map.clear();
            }

            map.put(ch, 1);
        }

        System.out.println("Minimum sets: " + count);
    }
}