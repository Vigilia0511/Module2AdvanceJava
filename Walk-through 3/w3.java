import java.util.Arrays;

public class w3 {
    public static void main(String[] args) {
        //1. Create an array of 5 student grades and calculate the average.
        int[] grades = {90, 99, 93, 96, 97};
        int sum = 0;

        for(int grade : grades){
            sum += grade;
        }
        int average = sum / grades.length;

        System.out.println("Student Grades: ");
        for(int i = 0; i < grades.length; i++){
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Average Grade: " + average);



        System.out.println(" ");
        //2. Find the maximum and minimum value in an array
        int[] numbers = {4, 22, 53, 11, 55};
        int min = numbers[0];
        int max = numbers[0];

        for(int num : numbers){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println("Array Elements: ");
        for(int num : numbers){
            System.out.println(num + " ");
        }
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);



        System.out.println(" ");
        //3. Reverse an array using a loop.
        String[] array = {"dog", "cat", "rat", "bird", "human"};

        System.out.println("Original Array: ");
        for (String num : array) {
            System.out.print(num + " ");
        }
        int length = array.length;
        for(int i = 0; i < length / 2; i++){
            String tempo = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = tempo;
        }
        System.out.println("\nReversed Array: ");
        for(String num : array){
            System.out.print(num + " ");
        }
        System.out.println();



        System.out.println(" ");
        //1. Write a program that merges two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];
     
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        System.out.println("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();



        System.out.println(" ");
        //2. Implement a program to remove duplicates from array.
        int[] numdubpli = {7, 6, 2, 8, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8};

        Arrays.sort(numdubpli);

        int[] tempo = new int[numdubpli.length];
        int cc = 0;

        for (int i = 0; i < numdubpli.length - 1; i++) {
            if (numdubpli[i] != numdubpli[i + 1]) {
                tempo[cc++] = numdubpli[i];
            }
        }
        tempo[cc++] = numdubpli[numdubpli.length - 1]; 

        int[] uniqueArray = Arrays.copyOf(tempo, cc);

        System.out.println("Array without duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}