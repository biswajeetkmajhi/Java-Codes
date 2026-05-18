/*5.Write a program which will overload the area () method and display the area of a circle, triangle and square as per user choice and user entered dimensions.*/

import java.util.*;

class AreaCalculator 
{

    double area(double radius) 
    {
        return Math.PI * radius * radius;
    }

    double area(double base, double height) 
    {
        return 0.5 * base * height;
    }

    double area(int side) 
    {
        return side * side;
    }
}

public class p5 
{
    public static void main(String[] args) 
    {
        AreaCalculator calculator = new AreaCalculator();
        Scanner x = new Scanner(System.in);

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1-3): ");
        int choice = x.nextInt();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = x.nextDouble();
                System.out.printf("Area of the circle: %.2f%n", calculator.area(radius));
                break;

            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = x.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = x.nextDouble();
                System.out.printf("Area of the triangle: %.2f%n", calculator.area(base, height));
                break;

            case 3:
                System.out.print("Enter the side of the square: ");
                int side = x.nextInt();
                System.out.printf("Area of the square: %.2f%n", calculator.area(side));
                break;
                
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}
