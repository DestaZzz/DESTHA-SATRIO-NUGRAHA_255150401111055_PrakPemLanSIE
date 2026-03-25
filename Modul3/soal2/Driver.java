public class Driver {
    private Car kendaraan;

    public Driver() {
        System.out.println("Driver is created.");
        kendaraan = new Car();
    }

    public void driving() {
        System.out.println("Driver is driving.");
        System.out.println("Using a car that has " + kendaraan.numWheel + " wheels.");
    }
}

