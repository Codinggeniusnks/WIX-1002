/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l1q4;

/**
 *
 * @author LENOVO
 */
public class L1Q4 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("          TABLE 1: TOTAL SALES OF PRODUCT A       ");
        System.out.println("==================================================");
        System.out.println("Month           | Amount (RM) | Bar Chart");
        System.out.println("--------------------------------------------------");
        
        String[] months = {
            "January 2016  ", 
            "February 2016 ", 
            "March 2016    ", 
            "April 2016    ", 
            "May 2016      ", 
            "Jun 2016      "
        };
        
        int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};
        
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " | " + amounts[i] + "     | ");
            
            int stars = amounts[i] / 200;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================================================");
        System.out.println("Note: Each '*' represents RM200 in sales.");
    }
}
