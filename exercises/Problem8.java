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
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(" number is: " + i + " and cube of " + i + " is: " + (i * i * i));
        }
    }
}
