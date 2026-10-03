package org.example.AbsInterfaceAssignment;

public class Eagle implements FlightBirds {

    @Override
    public void eat() {
        System.out.println("Eagles eat by catching live prey");
    }

    @Override
    public void reproduce() {
        System.out.println("Eagles reproduce by laying eggs");
    }

    @Override
    public void fly() {
        System.out.println("Eagles fly because they are flight birds");
    }
}
