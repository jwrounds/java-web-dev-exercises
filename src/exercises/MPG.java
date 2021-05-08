package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        miles = input.nextDouble();

        System.out.println("How many gallons have you guzzled?");
        gallons = input.nextDouble();

        milesPerGallon = miles / gallons;

        input.close();

        System.out.println("You drove " + milesPerGallon + " miles per gallon guzzled.");
    }
}
