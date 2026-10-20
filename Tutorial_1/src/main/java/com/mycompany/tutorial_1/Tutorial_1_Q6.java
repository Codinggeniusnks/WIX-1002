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
public class Tutorial_1_Q6 {
    public static void main(String[] args){
        Random rand = new Random();
        int minimum = rand.nextInt(1,100);
        int i = 1;
        while(i < 10){
            int number = rand.nextInt(1,100);
            if (number < minimum){
                minimum = number;
            }
            i = i+ 1;
            
        }
        System.out.println(minimum);
        
    }
    
}
