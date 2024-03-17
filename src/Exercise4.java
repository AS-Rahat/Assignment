import java.util.Scanner;

public class Exercise4 {
    public static void main(String arg[]){
        double meters;
        double miles;
        double feet;
        double inches;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter number in Meter=");
        meters=input.nextDouble();

        input.close();

        miles = meters * 0.000621371192;
        feet = meters * 3.2808399;
        inches = meters * 39.3700787;

        System.out.printf("\nMiles: %.4f\n", miles);

        System.out.printf("Feet: %.4f\n", feet);

        System.out.printf("Inches: %.4f",inches);






    }
}
