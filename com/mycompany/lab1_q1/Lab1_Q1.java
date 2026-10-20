/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1_q1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Lab1_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8;
        System.out.printf("%f Fahrenheit = %.2f celcius",Fahrenheit,Celsius);
        }
}
