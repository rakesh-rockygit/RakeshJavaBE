package Trafficlight;


public class TrafficSignal {
    
   public static void main(String[] args) {

     TrafficSignal TrafficSignal = new TrafficSignal();     
        System.out.println(TrafficSignal.trafficLight("GREEN"));
    
   }

 /* Ask the user for a traffic light colour (red, orange, green).
     Use a modern switch expression to print the appropriate instruction: 
     Stop / Slow down / Go. Handle unknown colours with a default. */

     private String trafficLight(String colour){
             String instruction = "";
             String result = switch (colour) {
              case "RED" -> "STOP";
              case "ORANGE" -> "WAIT";
              case "GREEN" -> "GO";
              default -> "Incorrect Signal";
            };
            return result;
        }
    }