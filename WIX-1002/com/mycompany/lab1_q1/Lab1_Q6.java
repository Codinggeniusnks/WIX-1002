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
public class Lab1_Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        int M = sc.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = (sc.nextDouble() - 32) / 1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (sc.nextDouble() - 32) / 1.8;
        double Q = M * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %7.6e",Q);
    }
    
}
