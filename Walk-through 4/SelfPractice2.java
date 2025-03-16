import java.util.Scanner;

public class SelfPractice2 {
    public static void main(String[] args) {
        //2. Implement insertion sort on an array of strings.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] array = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        insertionSort(array);
        System.out.println("Sorted Strings:");
        for (String str : array) {
            System.out.println(str);
        }

        scanner.close();
    }
    public static void insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
