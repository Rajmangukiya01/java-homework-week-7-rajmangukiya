package javahomeworkweek7;
// Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Program16 obj = new Program16();
        obj.myMethod();
    }

    public void myMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scan.nextInt();
        if (a > 0) {
            System.out.println(a + " is Positive");
        } else if (a < 0) {
            System.out.println(a + " is Negative");
        } else {
            System.out.println(a + " is Zero");
        }
    }
}
