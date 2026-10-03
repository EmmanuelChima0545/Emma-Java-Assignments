package org.example.AbsInterfaceAssignment;

public class Ostrich implements NonFlightBirds{
    @Override
    public void eat() {
        System.out.println("Ostrich eats by swallowing their food whole ");
    }

    @Override
    public void reproduce() {
        System.out.println("Ostrich reproduce by laying eggs");
    }

    @Override
    public void hop() {
        System.out.println("Ostrich hop and not fly because of their weight");
    }
}
