public class Driver {
    private Car mobil;

    public Driver() {
        System.out.println("Driver is created.");
        this.mobil = new Car();
    }

    public void driving() {
        System.out.println("Driver is driving.");
        System.out.println("Using a car that has " + mobil.numWheel + " wheels.");
    }
}