package org.example.homework.point;

public class Point implements Movable {

    private int coordinateX;
    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public void moveUp(int up) {
        setCoordinateY(getCoordinateY() + up);
        System.out.println("Текущие координаты = " + "X:" + getCoordinateX() + " Y:" + getCoordinateY());

    }

    @Override
    public void moveDown(int down) {
        setCoordinateY(getCoordinateY() - down);
        System.out.println("Текущие координаты = " + "X:" + getCoordinateX() + " Y:" + getCoordinateY());

    }

    @Override
    public void moveLeft(int left) {
        setCoordinateX(getCoordinateX() - left);
        System.out.println("Текущие координаты = " + "X:" + getCoordinateX() + " Y:" + getCoordinateY());

    }

    @Override
    public void moveRight(int right) {
        setCoordinateX(getCoordinateX() + right);
        System.out.println("Текущие координаты = " + "X:" + getCoordinateX() + " Y:" + getCoordinateY());
    }
}
