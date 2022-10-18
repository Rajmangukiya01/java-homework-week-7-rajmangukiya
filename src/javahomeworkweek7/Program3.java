package javahomeworkweek7;
/*  Write a java program to input student Name, roll No, and three subjects Math, Science and
    English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
    Input, Marks should between 0 to 100”) and find out total, percentage and result.
    If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
    %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        method();
    }


    public static void method() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student name : ");
        String name = scan.nextLine();
        System.out.println("Enter Roll no. : ");
        int rollNo = scan.nextInt();


        System.out.println("Enter marks of Math : ");
        int math = scan.nextInt();
        if (math > 100) {
            System.out.println("Invalid inputs, Marks should between 0 to 100 ");
        }


        System.out.println("Enter marks of Science : ");
        int science = scan.nextInt();
        if (science > 100) {
            System.out.println("Invalid inputs, Marks should between 0 to 100 ");
        }


        System.out.println("Enter marks of English : ");
        int english = scan.nextInt();
        if (english > 100) {
            System.out.println("Invalid inputs, Marks should between 0 to 100 ");
        }


        int total = (math + science + english);
        System.out.println("Total :" + total);
        double percentage = (math + science + english) / 3;
        System.out.println("Percentage :" + percentage);


        System.out.println("|-------------------------------|");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|-------------------------------|");
        System.out.println("|   Name   :  " + name + "               |");
        System.out.println("| Roll no  :  " + rollNo + "                | ");
        System.out.println("|-------------------------------|");
        System.out.println("| Subject  :        Marks       |");
        System.out.println("|-------------------------------|");
        System.out.println("| Maths    : " + math + "                 |");
        System.out.println("| Science  : " + science + "                 |");
        System.out.println("| English  : " + english + "                 |");
        System.out.println("|-------------------------------|");
        System.out.println("| Total    : " + total + "                |");
        System.out.println("|-------------------------------|");
        System.out.println("| Percentage : " + percentage + "             |");
        if (math < 35 || science < 35 || english < 35) {
            System.out.println("| Result :          Fail        |");
        } else {
            System.out.println("| Result :          Pass        |");
        }
        if (percentage >= 35) {
        } else if (percentage >= 80) {
            System.out.println("|  Grade     :              A+|");
        } else if (percentage < 80 && percentage >= 60) {
            System.out.println("|  Grade     :               A|");
        } else if (percentage < 60 && percentage >= 50) {
            System.out.println("|  Grade     :               B|");
        } else if (percentage < 50 && percentage >= 35) {
            System.out.println("|  Grade     :               C|");
        }
        System.out.println("|-------------------------------|");
    }

}


