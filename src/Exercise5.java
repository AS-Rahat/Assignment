import java.util.Scanner;

public class Exercise5 {

    public static void main(String arg[]){
        double radius;
      System.out.print("Enter the radius=");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
      double area;
      double volume;
      double hight =5 ;
     area = Math.PI*radius*radius;
     volume =Math.PI*radius*radius*hight;
     System.out.println("Area of a circle=" + area);
     System.out.println("Volume of sphere=" + volume);
    }
}
