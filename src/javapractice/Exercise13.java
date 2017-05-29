package javapractice;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the sides of the rectangle to get the perimeter and area of the rectangle");
        
        double sideOne = in.nextDouble();
        double sideTwo = in.nextDouble();
        
        double perimeter = sideOne * 2 + sideTwo * 2;
        double area = sideOne * sideTwo;
        
        System.out.println("The area is " + area + " and the perimeter is " + perimeter);
    }
}
