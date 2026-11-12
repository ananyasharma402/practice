import java.util.Scanner;
public class Insertatindex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int n = 5;

        // Initial array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // INSERTION
        System.out.print("\nEnter index to insert: ");
        int index = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();

        if (index >= 0 && index <= n && n < arr.length) {

            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            arr[index] = value;
            n++;

            System.out.print("After insertion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println("Invalid index or array is full");
        }

        // DELETION
        System.out.print("\nEnter element to delete: ");
        int deleteValue = sc.nextInt();

        int i = 0;

        while (i < n && arr[i] != deleteValue) {
            i++;
        }

        if (i < n) {

            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            n--;

            System.out.print("After deletion: ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }

        } else {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}


