
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Input distance in meters ");
       double distance = sc.nextInt();
       
        System.out.println("Input hour");
        int hour = sc.nextInt();
        
        System.out.println("Input minutes");
        int minutes = sc.nextInt();
        
        System.out.println("Input seconds");
        int seconds = sc.nextInt();
        
        double totalseconds = (hour * 3600) + (minutes * 60) + seconds;
        double metersPerseconds = distance / totalseconds;
        double kmPerHour = (distance / 1000) / (totalseconds / 3600);
        double milesPerHour = (distance / 1609) / (totalseconds / 3600);
        
        System.out.println("your speed in meter/second is " + metersPerseconds);
        System.out.println("Your speed in km/h is " + kmPerHour);
        System.out.println("your speed in miles/h " + milesPerHour);
        
        
    }
}
