package ru.mirea.kabo0222.task2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 1, 4, 4, 1, 1);

        System.out.println(rectangle);

        rectangle.moveUp();
        rectangle.moveRight();

        System.out.println(rectangle);
    }
}