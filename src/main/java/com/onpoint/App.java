package com.onpoint;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        int x = 10;
        int y = 20;

        // 1. poi

        int z = x + y;

        Vector vec1 = new Vector(3, 4);
        double len = vec1.length();

        // 4. poi

        Vector vec2 = new Vector(1, 2);
        vec1.setX(5);
        vec2.setY(7);

        // 6. poi

        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
        System.out.println("vec1: " + vec1 + ", len: " + len);
        System.out.println("vec2: " + vec2);
    }
}
