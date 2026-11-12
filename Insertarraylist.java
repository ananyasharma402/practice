import java.util.ArrayList;
import java.util.Scanner;
public class Insertarraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Initial elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original ArrayList: " + list);

        // INSERTION
        System.out.print("Enter index to insert: ");
        int index = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();

        if (index >= 0 && index <= list.size()) {

            list.add(index, value);

            System.out.println("After insertion: " + list);

        } else {
            System.out.println("Invalid index!");
        }

        // DELETION BY VALUE
        System.out.print("Enter element to delete: ");
        int deleteValue = sc.nextInt();

        boolean removed = list.remove(Integer.valueOf(deleteValue));

        if (removed) {
            System.out.println("After deletion: " + list);
        } else {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}


