package exercises;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double miles;
        double gallon;

        System.out.println("How many miles did you drive? ");
        miles = scanner.nextDouble();
        System.out.println("How many gallons of gas did you use? ");
        gallon = scanner.nextDouble();
        double mpg = miles / gallon;
        System.out.println("Your miles per gallon are: " + mpg);
    }
}
