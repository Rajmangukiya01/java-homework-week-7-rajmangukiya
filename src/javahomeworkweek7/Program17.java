package javahomeworkweek7;
// Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        arr();
        Program17 obj = new Program17();
        obj.arr2();
    }

    public static void arr() {
        int[] array1 = {19, 10, 17, 18, 15};
        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(array1));
    }

    public void arr2() {
        String[] array2 = {"String", "Java", "Python", "Test", "Software"};
        System.out.println("Original String array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array : " + Arrays.toString(array2));
    }
}
