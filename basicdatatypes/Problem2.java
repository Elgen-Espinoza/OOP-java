
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Input a value for inches:");
        double inch = sc.nextDouble();
        
        double meters = inch*0.0254;
       System.out.println (inch + " inches is " + meters + " meters");
        
    }  
}
