/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecturer_exercise_week_2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.Random;

public class Week2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Question 2
        int num1 = 88;
        char letter1 = 'W';
        String name = "Saw";
        char c = 1574;
        
        //Question 3
        final double pi = 3.14;
        
        //Question 4
        int x = 20;
        int y = 7;
        System.out.println(x/(y*1.0));
        System.out.println(x/ (double) y);
        System.out.println((double) x/y);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(x + " + " + y + " = " + (x+y));
        
        //Question 5
        System.out.println("Num 1:");
        int num = sc.nextInt();
        System.out.println("Num 2:");
        int num2 = sc.nextInt();
        System.out.println("Result"+(num * num2));
        
        //Question 6
        System.out.println("Age:");
        int age = sc.nextInt();
        System.out.println("Name:");
        String nameUser = sc.next();
        System.out.printf("Welcome %s Age - %d",nameUser,age);
        
        //Question 7
        System.out.println("Hi");
        System.out.print("Hi2");
        System.out.println("Hi3");
        
        //Question 8
        System.out.printf("answer is %.3f\t%4d\n", (x*1.0/y), y);
        System.out.printf("Name %s Weight %.2f\n", "Ang Tan Fong", 45.23);
        
        //Question 9
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        System.out.println(randomNum);
        
        //Question 10
        int randomNum1 = rand.nextInt(91)+10;
        int randomNum2 = rand.nextInt(41)-20;
        
        System.out.println(randomNum1+ "and" + randomNum2);
        
    }
    
}
