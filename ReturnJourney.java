/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class ReturnJourney {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int speed = 250; 
        int stopEveryRefuel = 200; // in kilometers
        int stopTimeMinutes = 5; // in minutes

        int refuelStops = totalDistance / stopEveryRefuel;

        double travelTimeHours = (double) totalDistance / speed;
        double stopTimeHours = (double) (refuelStops * stopTimeMinutes) / 60;
        double totalTimeHours = travelTimeHours + stopTimeHours;
        System.out.println("Total travel time for return journey: " + totalTimeHours + " hours");
    }
}
