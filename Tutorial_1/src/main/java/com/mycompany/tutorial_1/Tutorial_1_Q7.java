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
public class Tutorial_1_Q7 {
    public static void main(String[] args){
        Random rand = new Random();
        int oddnumber = 0;
        int evennumber = 0;
        int i = 0;
        while(i<10){
            int number = rand.nextInt(91)+10;
            if (number %2 == 0){
                evennumber ++;
            }else{
                oddnumber ++;
            }
        }
        System.out.println("Odd Number Count:" + oddnumber);
        System.out.println("Even Number Count:" + evennumber);
        
    }
}
