package org.launchcode.java.studios;
//area of a circle: A=pi*r*r

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0.0;
        double areaOfCircle = 0.0;

        //create scanner to receive input
        Scanner in = new Scanner(System.in);

        while (radius <= 0) {
            //ask for a radius
            System.out.println("Enter the radius of the circle: ");
            radius = in.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid radius; try again.");
                radius = 0.0;
                continue;
            }

            areaOfCircle = 3.14 * radius * radius;
            System.out.println("The area of a circle with radius " + radius + " is: " + areaOfCircle);
        }
    }

}
