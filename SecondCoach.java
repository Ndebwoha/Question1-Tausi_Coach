/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class SecondCoach {
     public static void main(String[] args) {
        int totalDistance = 10000; 
        double speed = 225.5;

        double speedKmh = (speed * 3600) / 1000;

        double travelTimeHours = (double) totalDistance / speedKmh;

        // Starting time is 09:00 hours
        double startTimeHours = 9.0;

        double arrivalTime = startTimeHours + travelTimeHours;

        System.out.println("Approximate arrival time: " + arrivalTime + " hours");
    }
    
}
