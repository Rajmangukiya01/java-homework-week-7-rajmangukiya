package javahomeworkweek7;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        abc();
    }

    public static void abc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}

