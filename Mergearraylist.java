
import java.util.ArrayList;

public class Mergearraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        list2.add(15);
        list2.add(25);
        list2.add(35);
        list2.add(45);

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        // Compare elements of both lists
        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements of list1
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        // Add remaining elements of list2
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        System.out.println("Merged ArrayList: " + result);
    }
}


    
    


