/*2.Write a program in Java to create a class Rectangle having data members 	length and breadth and three methods called read, calculate and display to read the values of 	length and breadth,  calculate the area and perimeter of the rectangle and display the result  	respectively*/

import java.util.*; 
class Rectangle
{
	double length,breadth,area,perimeter;
	
	public void read()
	{
		Scanner x=new Scanner(System.in);

		System.out.println("Enter length of rectangle :");
		length=x.nextDouble();

		System.out.println("Enter breadth of rectangle :");
		breadth=x.nextDouble();
	}

	public void calculate()
	{
		area=length*breadth;
		perimeter=2*(length+breadth);
	}
	
	public void display()
	{
		System.out.println("Area of the rectangle :"+area);
		System.out.println("Perimeter of the rectangle :"+perimeter);
	}
	
	
}

class Main
{
	public static void main(String args[])
	{
		Rectangle ob=new Rectangle();
		ob.read();
		ob.calculate();
		ob.display();
	}
}
