package exercises;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input firt number");
        int num1 = sc.nextInt();
        System.out.println("Input second number");
        int num2 = sc.nextInt();
        int num  = sc.nextInt();
        
        int sum = num1 + num2;
        int prod = num1 * num2;
        int diff = num1 - num2;
        int qou = num1 / num2;
        int mod = num1 % num2;
        
        System.out.println(num1 + " + " + num2 " = " + sum);
    }
}
