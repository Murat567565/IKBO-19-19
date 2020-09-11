package ru.mirea;

public class Circle {
    private int radius;
    private int xPos =0;
    private int yPos =0;
    public final double lenght = 2 * Math.PI * radius ;

    public Circle(int radius, int xPos, int yPos) {
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public double getLenght() {
        return lenght;
    }
    public double getSpace(){
     return lenght*radius;
    }
}
