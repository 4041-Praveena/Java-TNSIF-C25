package Inheritance.task1;

//base class
class Shape
{
	private String colour;
	
	public Shape(String colour) //constructor
	{
		this.colour=colour;
	}
	
	public void setcolour( String colour) //setter method
	{
		this.colour=colour;
	}
	
	public String getcolour() //getter method
	{
		return colour;
	}
	
	public double area() //to print area
	{
		return 0.0;
	
	}
	
	public double perimeter() //to print perimeter
	{
		return 0.0;
	}

	public void display() //to display the attributes
	{
		System.out.println(" =======================");
		System.out.println(" Colour :"+colour);
		System.out.printf(" Area :%.2f \n" ,area());
		System.out.printf(" Perimeter :%.2f \n",perimeter());
		
	
	}
}

// child class 1
class Circle extends Shape
{
	
	public void display() // overriding of display method 
	{
		
		System.out.println(" Circle details are :");
		super.display();
	}

	private double r; 
	
	public Circle(String colour,double r) //constructor
	{
		super(colour);
		this.r=r;
	}
	
	public void setr(double r) //setter method
	{
		this.r=r;
	}
	
	public double getr() //getter method
	{
		return r;
	}
	
	public double area() //to print area

	{
		return Math.PI*r*r;
	}
	
	public double perimeter() //to print perimeter

	{
		return 2*Math.PI*r;
	}	
	
}

//child class 2
class Rectangle extends Shape
{
	private double l,b;
	
	public Rectangle(String colour,double l,double b) //constructor
	{
		super(colour);
		this.l=l;
		this.b=b;
	}
	
	public void setl(double l) //setter method
	{
		this.l=l;
	}
	
	public double getl() //getter method
	{
		return l;
	}
	
	public void setb(double b)  //setter method
	{
		this.b=b;
	}
	
	public double getb() //getter method
	{
		return b;
	}
	
	public double area() //to print area

	{
		return l*b;
	}
	
	public double perimeter() //to print perimeter

	{
		return 2*(l+b);
	}
	
	public void display()  // overriding of display method
	{
		System.out.println(" \n\n\n Rectangle details are :");
		super.display();
	}
}

//child class 3
class Triangle extends Shape
{
	private double a,b,c;
	
	public Triangle(String colour,double a,double b,double c) //constructor
	{
		super(colour);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void seta(double a) //setter method
	{
		this.a=a;
	}
	
	public double geta() //getter method
	{
		return a;
	}
	
	public void setb(double b) //setter method
	{
		this.b=b;
	}
	
	public double getb() //getter method
	{
		return b;
	}
	
	public void setc(double c) //setter method
	{
		this.c=c;
	}
	
	public double getc() //getter method
	{
		return c;
	}
	
	public double area() //to print area

	{
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public double perimeter() //to print perimeter

	{
		return a+b+c;
	}
	
	public void display()  // overriding of display method
	{
		System.out.println(" \n\n\n Triangle details are :");
		super.display();
	}
}

// main method
public class show {

	public static void main(String[] args) {
		
		// object creation
		Shape s=new Circle("Black",5.2);
		s.display();
		s=new Rectangle("White",5.5,2.5);
		s.display();
		s=new Triangle("Blue",3,4,4);
		s.display();
		
		

	}

}
