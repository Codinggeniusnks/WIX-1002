/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial_1;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class Tutorial_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number:");
        double number1 = sc.nextDouble();
        System.out.println("Second Number:");
        double number2 = sc.nextDouble();
        System.out.println("Result:" + (number1 * number2));
    }
}
