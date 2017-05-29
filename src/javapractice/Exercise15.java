/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

public class Exercise15 {
    public static void main(String[] args) {
        String stringOne = "This is the first string";
        String stringTwo = "This is the second string";
        
        System.out.println("Before Switching:\n stringOne = " + stringOne + "\n stringTwo = " + stringTwo);
        
        String temp = stringOne;
        stringOne = stringTwo;
        stringTwo = temp;
        
        System.out.println("After switching: \n stringOne = " + stringOne + "\n stringTwo = " + stringTwo);
        
        
    }
}
