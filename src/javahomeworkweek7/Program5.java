package javahomeworkweek7;
/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 Print in following format */

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        myForm();
    }

    public static void myForm() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee Id : ");
        int empId = scan.nextInt();
        System.out.println("Employee Name : ");
        String empName = scan.next();
        System.out.println("Basic salary : ");
        double salary = scan.nextInt();
        System.out.println("______________________________");
        System.out.println("|         Salary Slip        |");
        System.out.println("|____________________________|");
        System.out.println("|Employee Id   :   " + empId + "        |");
        System.out.println("|Employee Name :   " + empName + "       |");
        System.out.println("|____________________________|");
        System.out.println("|Basic salary  :   " + salary + "   |");
        double hra = salary * 0.10;
        System.out.println("|HRA 10%       :   " + hra + "    |");
        double ta = salary * 0.08;
        System.out.println("|TA 8%         :   " + ta + "    |");
        double da = salary * 0.09;
        System.out.println("|DA 9%         :   " + da + "    |");
        double pf = salary * 0.2;
        System.out.println("|PF -20%       :   " + pf + "    |");
        System.out.println("|____________________________|");
        double total = salary + hra + ta + da - pf;
        System.out.println("|Gross Salary  :   " + total + "  |");
        System.out.println("|===========================|");
    }
}
