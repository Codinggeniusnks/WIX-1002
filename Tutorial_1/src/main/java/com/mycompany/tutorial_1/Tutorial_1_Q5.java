/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial_1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Tutorial_1_Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Width (cm):");
        double width = sc.nextDouble();
        System.out.println("Length (cm):");
        double length = sc.nextDouble();
        double perimeter = 2*(width + length);
        System.out.println("Perimeter:"+perimeter);
        
    }
    
}
