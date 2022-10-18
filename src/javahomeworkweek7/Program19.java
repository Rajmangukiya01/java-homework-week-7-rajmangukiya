package javahomeworkweek7;
//Write a Java program to calculate the average value of array elements

public class Program19 {
    public static void main(String[] args) {
        ary();
    }

    public static void ary() {
        int[] abc = {5, 10, 15, 20, 25, 30};
        int sum = 0;

        for (int i = 0; i < abc.length; i++) {
            sum = sum + abc[i];

        }
        double average = sum / abc.length;
        System.out.println("Average of array is " + average);
    }
}
