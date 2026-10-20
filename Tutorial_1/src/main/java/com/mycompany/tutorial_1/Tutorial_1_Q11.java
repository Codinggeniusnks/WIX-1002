/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial_1;

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
import java.util.Random;
public class Tutorial_1_Q11 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] number = new int[5];
        int i = 0;
        int temporary = 0;
        int k = 0;
        while (i<5){
            number[i] = rand.nextInt(100)+1;
            i++;
        }
        System.out.println(Arrays.toString(number));
        while(k<5){
            int j = 0;
            while (j<4){
                if (number[j] < number[j+1]){
                    temporary = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temporary;
                }
                j++;
            }
            k++;
        }
        System.out.println(Arrays.toString(number));
    }
    
}
