
// Module 5 Excercise 5,4
// By Addison Roy

// Imports 
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double miles;
        final double CONVERSION_FACTOR = 1.609;

        System.out.print("Simple Java program to convert Miles to Kilometers\n");
        System.out.println("Miles\tKilometers");
        System.out.println("---------------------");
        
        while (true) {
            System.out.print("Enter miles or enter 'q' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            
            try {
                miles = Double.parseDouble(input);
                double kilometers = miles * CONVERSION_FACTOR;
                System.out.printf("%.2f\t%.3f%n", miles, kilometers);
            } catch (NumberFormatException e) {
                System.out.println("Invalid, Enter a number");
            }
        }
        
        scanner.close();
        System.out.println("Thanks for using me!");
    }
}
