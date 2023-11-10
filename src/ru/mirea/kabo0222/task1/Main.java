package ru.mirea.kabo0222.task1;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(10, 5, 0, 0);

        System.out.println("Начальные координаты: x = " + rectangle.getX() + ", y = " + rectangle.getY());

        rectangle.moveRight();
        rectangle.moveDown();

        System.out.println("Новые координаты: x = " + rectangle.getX() + ", y = " + rectangle.getY());
    }
}