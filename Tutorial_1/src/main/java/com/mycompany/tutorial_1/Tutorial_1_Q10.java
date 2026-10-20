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
public class Tutorial_1_Q10 {
    public static void main(String[] args){
        Random rand = new Random();
        int female = 0;
        int i = 0;
        while(i<100){
            int gender = rand.nextInt(2);
            if(gender == 0){
                female++;
            }
            i++;
        }
        System.out.println("Female Count:"+female);
    }
    
}
