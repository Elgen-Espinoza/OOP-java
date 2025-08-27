
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in pounds :");
       double weightPounds = sc.nextInt();
       
        System.out.println("Input height in inches:");
        double heightInches = sc.nextInt();
        
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        double BMI = weightKg / (heightMeters * heightMeters);
        
        System.out.println(" Body Mass Index is " + BMI);
    }
}
