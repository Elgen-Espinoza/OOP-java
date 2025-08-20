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
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Input the 1st number: ");
        int firstnum = sc.nextInt();
         System.out.println("Input the 2nd number:");
         int secondnum = sc.nextInt();
        System.out.println("Input the 3rd number:");
          int thirdnum = sc.nextInt();
          
          
          if (firstnum >secondnum){
              System.out.println("The greatest:"+ firstnum);
          }else if (secondnum >thirdnum){
              System.out.println("The greatest:"+ secondnum);
          }else 
              System.out.println("The greatest"+ thirdnum);
    }
}
