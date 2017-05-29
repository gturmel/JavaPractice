package javapractice;
import java.util.Scanner;
public class JavaPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 3 numbers as input, then output average
        System.out.println("Enter 3 numbers to find their average");
        
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
        
        double sumNum = num1 + num2 + num3;
        double avg = sumNum / 3;
        
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + avg);
        
    }
    
}
