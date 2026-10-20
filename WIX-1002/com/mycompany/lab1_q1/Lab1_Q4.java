/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_q1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Lab1_Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of seconds: ");
            int seconds = sc.nextInt();
            int hour = seconds / 3600;
            int minute = (seconds - hour*3600)/60;
            int secondsTime = seconds - (hour*3600)-(minute*60);
            System.out.printf("%d seconds is %d hours %d minutes and %d seconds",seconds,hour,minute,secondsTime);
    }
    
}
