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
public class Lab1_Q3 {
    public static void main(String[] args){
        Random rand = new Random();
        int i =0;
        double average = 0;
        int total = 0;
        while(i<3){
            int randomNum = rand.nextInt(41)+10;
            total += randomNum;
            System.out.println("First Number:"+randomNum);
            i++;
        }
        average = total / 3.0;
        System.out.printf("Total: %d Average: %.2f",total,average);
    }
}
