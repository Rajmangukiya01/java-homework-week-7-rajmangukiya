package javahomeworkweek7;
//Write a Java program to sum values of an array

public class Program18 {
    public static void main(String[] args) {
        Program18 obj = new Program18();
        obj.ary();
    }

    public void ary() {
        int[] abc = {5, 10, 15, 20, 25, 30};
        int sum = 0;

        for (int i = 0; i < abc.length; i++) {
            sum = sum + abc[i];
        }
        System.out.println("Sum of array is " + sum);
    }
}
