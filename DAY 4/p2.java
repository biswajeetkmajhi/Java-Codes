/*2.Illustrate the execution of constructors in multi-level  inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.*/

import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate(double len, double wid) {
        length = len;
        width = wid;
        System.out.println("Plate constructor called: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double len, double wid, double hei) {
        super(len, wid); // Call to Plate constructor
        height = hei;
        System.out.println("Box constructor called: Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double len, double wid, double hei, double thick) {
        super(len, wid, hei); // Call to Box constructor
        thickness = thick;
        System.out.println("WoodBox constructor called: Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thickness);
    }
}

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length (in ft): ");
        double length = scanner.nextDouble();

        System.out.print("Enter width (in ft): ");
        double width = scanner.nextDouble();

        System.out.print("Enter height (in ft): ");
        double height = scanner.nextDouble();

        System.out.print("Enter thickness (in ft): ");
        double thickness = scanner.nextDouble();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);

    }
}
