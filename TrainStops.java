/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ndebwoha.oop_examination;

/**
 *
 * @author Ndebwoha
 */
public class TrainStops {
    public static void main(String[] args) {
        int totalDistance = 10000; 
        int stopEveryPassenger = 150;
        int stopEveryRefuel = 200; 
// in kilometers

        int passengerStops = totalDistance / stopEveryPassenger;
        int refuelStops = totalDistance / stopEveryRefuel;

        // Considering the train must stop whenever either condition is met
        int totalStops = Math.max(passengerStops, refuelStops);

        System.out.println("Total number of stops: " + totalStops);
    }
}
    

