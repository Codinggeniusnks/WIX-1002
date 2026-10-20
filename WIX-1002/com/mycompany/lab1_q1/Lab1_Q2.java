/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_q1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Lab1_Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("The price of the car: ");
        double P = sc.nextDouble();
        System.out.print("The down payment: ");
        double D = sc.nextDouble();
        System.out.print("The interest Rate in %: ");
        double R = sc.nextDouble();
        System.out.print("The loan duration in year: ");
        double Y = sc.nextDouble();
        double M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly Payment: %.2f",M);
    }
    
}
