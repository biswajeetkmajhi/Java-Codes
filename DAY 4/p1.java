/*1.A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 	Implement it in Java to calculate the cost of plastic as per the dimensions given by the user 	where 3D inherits from 2D.*/

import java.util.Scanner;

class TwoDShape 
{
    double length;
    double width;

    TwoDShape(double len, double wid) 
    {
        length = len;
        width = wid;
    }

    double calculateArea() {
        return length * width;
    }

    double calculateCost() {
        return calculateArea() * 40; 
    }
}

class ThreeDShape extends TwoDShape {
    double height;

    ThreeDShape(double len, double wid, double hei) 
    {   
        super(len, wid);
        height = hei;
    }

    double calculateVolume() {
        return length * width * height;
    }

    double calculateCost() {
        return calculateVolume() * 60; 
    }
}

class p1
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of plastic shape:");
        System.out.print("1. 2D Sheet\n2. 3D Box\nEnter choice :");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter length (in ft): ");
            double length = scanner.nextDouble();

            System.out.print("Enter width (in ft): ");
            double width = scanner.nextDouble();

            TwoDShape sheet = new TwoDShape(length, width);
            double cost = sheet.calculateCost();

            System.out.println("The cost of the 2D sheet is Rs "+ cost);

        } 
	else if (choice == 2) 
	{
            System.out.print("Enter length (in ft): ");
            double length = scanner.nextDouble();

            System.out.print("Enter width (in ft): ");
            double width = scanner.nextDouble();

            System.out.print("Enter height (in ft): ");
            double height = scanner.nextDouble();

            ThreeDShape box = new ThreeDShape(length, width, height);
            double cost = box.calculateCost();

            System.out.println("The cost of the 3D box is Rs "+ cost);

        } 
	else 
	{
            System.out.println("Invalid choice!");
        }

    }
}
