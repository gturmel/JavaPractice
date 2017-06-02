package javapractice;
public class BinaryNumberExercises {
    public static void main(String[] args) {
        int binaryOne = 0b101;
        int binaryTwo = 0b110;
        int sumBinary = binaryOne + binaryTwo;
        
        System.out.println("The sum of " + Integer.toBinaryString(binaryOne) + " + " + Integer.toBinaryString(binaryTwo) + " = " + Integer.toBinaryString(sumBinary));
        
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.home"));
    }
}
