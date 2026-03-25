public class Driver {
    private Car mobil;

    public Driver() {
        System.out.println("Driver is created.");
    }

    public void driving() {
        System.out.println("Driver is driving.");

        this.mobil = new Car();

        System.out.println("Using a car that has " + mobil.numWheel + " wheels.");
    }
}