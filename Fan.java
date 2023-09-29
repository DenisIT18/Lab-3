/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fan;

/**
 *
 * @author Денис
 */
import java.util.Scanner;
class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }
    public int Speed() {
        return speed;
    }

    public void Speed(int speed) {
        this.speed = speed;
    }

    public boolean ison() {
        return on;
    }

    public void seton(boolean on) {
        this.on = on;
    }

    public double radius() {
        return radius;
    }

    public void radius(double radius) {
        this.radius = radius;
    }

    public String color(String blue) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String String() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.Speed(FAST);
        fan1.radius(10.0);
        fan1.setColor("yellow");
        fan1.seton(true);

        Fan fan2 = new Fan();
        fan2.Speed(MEDIUM);
        fan2.radius(5.0);
        fan2.color("blue");
        fan2.seton(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}