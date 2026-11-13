
import java.util.ArrayList;
import java.util.Scanner;

public class Frequencies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ArrayList<Integer> elements = new ArrayList<>();
        ArrayList<Integer> frequencies = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int num = list.get(i);

            if (elements.contains(num)) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(num)) {
                    count++;
                }
            }

            // Store element and its frequency
            elements.add(num);
            frequencies.add(count);
        }

        // Display stored frequencies
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i) +
                " occurs " + frequencies.get(i) + " times");
        }

        sc.close();
    }
}
