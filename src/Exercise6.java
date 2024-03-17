import java.util.Scanner;

public class Exercise6 {
    public static void main(String arg[]){

        System.out.println("Enter the number of gallon of gas in the tank=");
        double gallon;
        double cost;
        double mileage;
        Scanner input = new Scanner(System.in);
        gallon = input.nextDouble();
        cost=100*gallon;
        System.out.println("Total cost of gas=" + cost);
        mileage=60*gallon;
        System.out.println("Mileage=" + mileage);
    }
}
