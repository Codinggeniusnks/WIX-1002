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
public class Tutorial_1_Q4 {
    public static void main(String[] args){
        Random rand = new Random();
        int number1 = rand.nextInt(1,6);
        int number2 = rand.nextInt(1,6);
        System.out.println(number1);
        System.out.println(number2);
        if (number1 > number2){
            System.out.println("Player 1 Wins");
        }else if(number1 < number2){
            System.out.println("Player 2 Wins");
        }else{
            System.out.println("Draw");
        }
        
        
        
    }
}
