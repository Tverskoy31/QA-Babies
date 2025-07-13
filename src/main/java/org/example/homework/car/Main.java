package org.example.homework.car;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020);

        car.start();
        car.drive(100);
        car.stop();

        System.out.println("Марка: " + car.getMake());
        System.out.println("Модель: " + car.getModel());
        System.out.println("Год: " + car.getYearOfmanufacture());
    }
}
