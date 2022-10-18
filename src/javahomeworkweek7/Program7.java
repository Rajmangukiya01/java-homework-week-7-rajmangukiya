package javahomeworkweek7;
/* Write a java program input sales id, seller's name, sales amount, and salary basic and
   then fined this sales Commission

   Sales amount >= 50,000 35%
   Sales amount >= 30,000 20%
                >= 20,000 10%
                >= 10,000 5%
                < 10,000 2%*/

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Program7 obj = new Program7();
        obj.commission();
    }

    public void commission() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input sales Id : ");
        int id = scan.nextInt();
        System.out.println("Input seller's name : ");
        String name = scan.next();
        System.out.println("Enter sales amount : ");
        int amount = scan.nextInt();
        System.out.println("Basic salary : ");
        int salary = scan.nextInt();

        if (amount >= 50000) {
            System.out.println("Sales commission is : " + amount / 100 * 35);
        } else if (amount >= 30000) {
            System.out.println("Sales commission is : " + amount / 100 * 20);
        } else if (amount >= 20000) {
            System.out.println("Sales commission is : " + amount / 100 * 10);
        } else if (amount >= 10000) {
            System.out.println("Sales commission is : " + amount / 100 * 5);
        } else {
            System.out.println("Sales commission is : " + amount / 100 * 2);
        }

    }
}
