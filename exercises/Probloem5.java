/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Probloem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u') {
            System.out.println("Input letter is Vowel:");

        } else if (Character.isLetter(ch)) {
            System.out.println("Input letter is consonant:");
        } else {
            System.out.println("error message:");
        }
    }
}
