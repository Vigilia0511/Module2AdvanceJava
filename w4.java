import java.util.Arrays;

public class w4 {
    public static void main(String[] args) {
        //1. Modify the program to implement Selection Sort.
        int[] arr = {5, 1, 4, 2, 8};
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();



        System.out.println(" ");
        //2. Implement a Linear Search to find an element in an array.
        int[] array = {5, 1, 4, 2, 8};
        int target = 5;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }



        System.out.println(" ");
        //3. Convert the Linear Search into a Binary Search.
        int[] array1 = {5, 1, 4, 2, 8}; 
        int target1 = 5;
        Arrays.sort(array1);
        System.out.println("Sorted Array: " + Arrays.toString(array1));

        int index1 = binarySearch(array1, target1);

        if (index1 != -1) {
            System.out.println("Element " + target1 + " found at index " + index1 + ".");
        } else {
            System.out.println("Element " + target1 + " not found in the array.");
        }
    }
    public static int binarySearch(int[] array1, int target1) {
        int left = 0, right = array1.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array1[mid] == target1) {
                return mid;
            }
            if (array1[mid] < target1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;

    }
}