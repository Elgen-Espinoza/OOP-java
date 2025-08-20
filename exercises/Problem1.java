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
public class Problem1 {
     // TODO code application logic here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int num = sc.nextInt();
        
        if (num > 0){
            System.out.println(num + " is positive:");
        } else if (num < 0){
            System.out.println(num + " is negative");
        }
        
        
    }
}
