package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2=sc.nextInt();
        System.out.println("The sum of two numbers is: "+ (num1+num2));
        System.out.println("The the subtraction of the two numbers is: "+(num1-num2));
        System.out.println("The the multiplication of the two numbers is: "+(num1*num2));
        System.out.println("The the divided value of the two numbers is: "+(num1/num2));
    }



}
