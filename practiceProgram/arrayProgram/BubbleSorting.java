public class BubbleSorting {

    static void bubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
    static void printArr(int arr1[]) {

        for (int a : arr1) {

            System.out.print(a + ", ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 34, 56, 2, 4};
        System.out.println("Before Sorting: ");
        for (int a : arr) {
            System.out.print(a + ", ");
        }

        bubbleSorting(arr);
        System.out.println("\nAfter Sorting: ");
        printArr(arr);

    }
}
    
/* 
public class BubbleSorting {

    static void bubbleSorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                for (int a : arr) {

            System.out.print(a + ", ");
        }
        System.out.println();
            }

        }
    }
    // static void printArr(int arr1[]) {

    //     for (int a : arr1) {

    //         System.out.print(a + ", ");
    //     }

    // }

    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 34, 56, 2, 4};
        System.out.println("Before Sorting: ");
        for (int a : arr) {
            System.out.print(a + ", ");
        }

        bubbleSorting(arr);
        System.out.println("\nAfter Sorting: ");
        // printArr(arr);

    }
}
    */
