package org.example.homework.car;

public class Car implements Drivable {
    private String make;
    private String model;
    private int yearOfmanufacture;

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

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive(int distance) {

    }
}
