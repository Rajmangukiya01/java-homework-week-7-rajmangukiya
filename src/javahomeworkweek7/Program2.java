package javahomeworkweek7;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Program2 obj = new Program2();
        obj.myMethod();
    }

    public void myMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = scan.nextInt();

        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x == z) {
            System.out.println("This is leap year");
        } else if (y) {
            System.out.println("This is not leap year");
        } else {
            System.out.println("This is not leap year");
        }
    }
}
