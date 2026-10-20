/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1_q1;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
public class Lab1_Q5 {
    public static void main(String[] args){
        Random rand = new Random();
        int randomNum = rand.nextInt(0,10000);
        int temp = randomNum;
        int answer = 0;
        while(temp > 0){
      
            answer += temp % 10;
            temp /=10;
        }
        System.out.println("The digit:"+randomNum + " Sum of all digit:" + answer);
    }
}
