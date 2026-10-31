package arrayProgram;

import java.util.Scanner;

public class StringBinarySearch {

    public static void main(String[] args) {

        String[] arr = {"Alice", "Bob", "Charlie", "Jane", "John"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name to search: ");
        String searchElement = sc.nextLine();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid].equals(searchElement)) {

                System.out.println("Element found at index: " + mid);
                return;

            } else if (arr[mid].compareTo(searchElement) < 0) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        System.out.println("Element not found.");
    }
}
    

