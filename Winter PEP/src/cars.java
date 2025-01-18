public class cars {
    private String make;
    private String model;
    private int year;

    public cars() {
        this.make = "unknown";
        this.model = "unknown";
        this.year = 0;
    }

    public cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Engine starts>> make: " + make + " model: " + model + " year: " + year);
    }
}