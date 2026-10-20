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
import java.util.Random;
public class Tutorial_1_Q12 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int answer = rand.nextInt(100)+11;
        System.out.println("Guess the number");
        int guess = sc.nextInt();
        while (guess != answer){
            if(guess>answer){
                System.out.println("The answer is lower");
            }else{
                System.out.println("The answer is higher");
            }
            guess = sc.nextInt();
        }
        System.out.println("Correct! The answer is "+answer);
    }
    
}
