package com.onpoint;

public class Vector {

    private int x;

    private int y;

    public Vector(int x, int y) {

        // 2. poi

        this.x = x;
        this.y = y;
    }

    public double length() {
        double len = Math.sqrt(x * x + y * y);

        // 3. poi

        return len;
    }

    public int getX() { return x; }

    public void setX(int x) {

        // 5. poi

        this.x = x;
    }

    public int getY() { return y; }

    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return "(x: " + x + ", y: " + y + ")";
    }
}
