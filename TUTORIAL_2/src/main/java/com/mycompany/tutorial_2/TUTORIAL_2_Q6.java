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
public class TUTORIAL_2_Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double diameter = sc.nextDouble();
        double result = Math.PI * diameter;
        System.out.printf("The circumference of the circle is : " + "%.3f",result);
        
    }
    
}
