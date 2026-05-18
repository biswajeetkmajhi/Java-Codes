/*1.Write a class file – box with three data members(length, width, height) 	and a method volume() . Also implement the application class Demo where an object of 	the box class is created with user entered dimensions and volume is printed.*/

import java.util.*;
class Box
{
	double length , width , height;

	Box(double len,double wid,double hei)
	{
		length=len;
		width=wid;
		height=hei;
	}

	public double volume()
	{
		return  length * width * height;
	}
	
}

class Demo
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);

		System.out.println("Enter length of the box : ");
		double length=x.nextDouble();

		System.out.println("Enter width of the box : ");
		double width=x.nextDouble();

		System.out.println("Enter height of the box : ");
		double height=x.nextDouble();

		
		Box box=new Box(length,width,height);
		System.out.println("Volume of the box : "+ box.volume());
	}
}