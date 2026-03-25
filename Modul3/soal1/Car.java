public class Car extends Vehicle {
    private int numWheel = 4;
    public int getNumWheel() {
        return numWheel;
    }
    Car() {
        System.out.println("Car is created");
    }
    public void drift() {
        System.out.println("Car is drifting");
    }
    public void honk() {
        System.out.println("Car is honking");
    }
}
