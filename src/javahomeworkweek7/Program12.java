package javahomeworkweek7;
//Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        myPro();
    }

    public static void myPro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is alphabet. ");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is number.");
        } else {
            System.out.println(ch + " is symbol. ");
        }
    }
}
