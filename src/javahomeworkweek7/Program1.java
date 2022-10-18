package javahomeworkweek7;
//Write a java program that tells us that Input number is odd or even?

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        myMethod();
    }

    public static void myMethod() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = obj.nextInt();

        //ternary operators

        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + result);


    }
}
