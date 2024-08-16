/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int speed = 250;
        int stopEveryPassenger = 150;
        int stopEveryRefuel = 200;
        int stopTimeMinutes = 5; // in minutes

        int passengerStops = totalDistance / stopEveryPassenger;
        int refuelStops = totalDistance / stopEveryRefuel;
        int totalStops = Math.max(passengerStops, refuelStops);
        
        double travelTimeHours = (double) totalDistance / speed;
        double stopTimeHours = (double) (totalStops * stopTimeMinutes) / 60;
        double totalTimeHours = travelTimeHours + stopTimeHours;
        System.out.println("Total travel time: " + totalTimeHours + " hours");
    }
}
