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
public class Tutorial_1_Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks:");
        double mark = sc.nextDouble();
        if (mark >= 40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    
}
