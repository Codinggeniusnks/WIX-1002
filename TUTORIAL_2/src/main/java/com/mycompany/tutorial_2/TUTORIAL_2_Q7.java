/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial_2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class TUTORIAL_2_Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inch = sc.nextDouble();
        double centimeters = inch * 2.54;
        System.out.printf("%f inches = %.2f metres\n", inch, centimeters / 100);
        
    }
    
}
