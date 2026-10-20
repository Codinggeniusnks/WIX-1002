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
public class Tutorial_1_Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sentence:");
        String sentence = sc.nextLine().toUpperCase();
        int countU = 0;
        int countM = 0;
        int i = 0;
        while(i<sentence.length()){
                char ch = sentence.charAt(i);
            if(ch == 'U'){
                countU++;
            }
            if(ch == 'M'){
                countM++;
            }
            i++;
            
        }
        System.out.println("Number of U:" + countU);
        System.out.println("Number of M:" + countM);
        
    }
    
}
