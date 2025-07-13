package org.example.homework.car;

public class Car implements Drivable {
    private String make;
    private String model;
    private int yearOfmanufacture;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.yearOfmanufacture = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfmanufacture() {
        return yearOfmanufacture;
    }

    public void setYearOfmanufacture(int yearOfmanufacture) {
        this.yearOfmanufacture = yearOfmanufacture;
    }

    @Override
    public void start() {
        System.out.println("Машина завелась.");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Машина проехала " + distance + " км.");
    }
}
