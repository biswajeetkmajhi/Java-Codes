/*6.Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth. Use default constructor to initialize the value of the data member to zero and parameterized constructor to initialize the value of data member according to the user input.*/

import java.util.*;
class p6
{
	double length , breadth , area;

	p6()
	{
		length=0.0;
		breadth=0.0;
		area=0.0;
	}
	
	p6(double len,double bread)
	{
		area=len*bread;
	}
	
	public static void main(String args[])
	{
		
		Scanner x=new Scanner(System.in);

		System.out.print("Enter length of rectangle :");
		double length=x.nextDouble();

		System.out.print("Enter breadth of rectangle :");
		double breadth=x.nextDouble();
		
		p6 ob=new p6(length,breadth);

		System.out.println("Area of the rectangle :"+ob.area);
	}
}