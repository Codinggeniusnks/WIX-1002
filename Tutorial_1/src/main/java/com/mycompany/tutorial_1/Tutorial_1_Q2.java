/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial_1;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
public class Tutorial_1_Q2 {
    public static void main(String[] args){
        Random rand = new Random();
        int number = rand.nextInt(1,100);
        System.out.println(number);
        if (number > 50){
            System.out.println("Greater than 50");
        }else{
            System.out.println("Not greater than 50");
        }
        
    }
    
}
