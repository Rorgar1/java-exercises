/* program to calculate the area of a rectangle
and print the answer to the console.
You should prompt the user for the dimensions. */

package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declare length & width
        double length;
        double width;

        System.out.println("Enter length of rectangle: ");
        length = scanner.nextDouble();
        System.out.println("Enter width of rectangle: ");
        width = scanner.nextDouble();
        double Area = length * width;
        //all variables are filled in
        System.out.println("The area of your rectangle is: " + Area);
        }

}

