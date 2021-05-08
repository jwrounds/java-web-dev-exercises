package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle:");
        radius = input.nextDouble();

        if (Validate.validateInput(radius)) {
            area = Circle.getArea(radius);
            System.out.println("The area of your circle is: " + area);
        } else {
            System.out.println("Error: Invalid input");
        }

        input.close();
    }
}
