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
public class Problem2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int num = sc.nextInt();
        
        if (num % 3 == 0){
            System.out.println(num + " is divible by 3:");
        }else
            System.out.println(num + " is not divisible by 3:");
    }
            
}
