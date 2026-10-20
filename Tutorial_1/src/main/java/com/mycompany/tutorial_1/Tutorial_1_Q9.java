/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial_1;

/**
 *
 * @author LENOVO
 */
import java.net.URL;
import java.util.Scanner;

public class Tutorial_1_Q9 {
    public static void main(String[] args) {
        String urlString = "https://www.um.edu.my";
        String keyword = "universiti";
        int count = 0;

        try {
            URL url = new URL(urlString);
            Scanner webScanner = new Scanner(url.openStream());

            while (webScanner.hasNext()) {
                String word = webScanner.next().toLowerCase();
                if (word.contains(keyword.toLowerCase())) {
                    count++;
                }
            }
            webScanner.close();
            System.out.println("Frequency of '" + keyword + "': " + count);
        } catch (Exception e) {
            System.out.println("Unable to fetch webpage: " + e.getMessage());
        }
    }
}