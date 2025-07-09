package org.example.homework.point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setCoordinateX(0);
        point1.setCoordinateY(0);
        System.out.println("Начальные координаты = " + "X:" + point1.getCoordinateX() + " Y:" + point1.getCoordinateY());
        point1.moveRight(3);
        point1.moveUp(5);
        point1.moveDown(3);
        point1.moveLeft(8);
    }
}
