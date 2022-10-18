package javahomeworkweek7;
/* Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
   find addition, Subtraction, multiplication and division according to their symbol (using if else) */


import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Program10 obj = new Program10();
        obj.ope();
    }

    public void ope() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = scan.nextInt();
        System.out.println("Enter any operator(+,*,/) : ");
        char op = scan.next().charAt(0);

        if (op == '+') {
            System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
        } else if (op == '*') {
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        } else if (op == '/') {
            System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        } else {
            System.out.println("Operator is not valid");
        }
    }
}
