package org.example.AbsInterfaceAssignment;

public class BirdFamily {
    public static void main(String[] args) {
        FlightBirds eagle = new Eagle();
        NonFlightBirds ostrich = new Ostrich();

        eagle.fly();
        eagle.reproduce();

        ostrich.hop();
        ostrich.reproduce();
    }
}
