package Inheritance.task2;


//base class
class Vehicle
{
	private String make;
	private String model;
	private int year;
	
	public Vehicle(String make,String model,int year) //constructor
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	public void setmake( String make) //setter method
	{
		this.make=make;
	}
	
	public void setmodel( String model) //setter method
	{
		this.model=model;
	}
	
	public void setyear(int year) //setter method
	{
		this.year=year;
	}
	
	public String getmake() //getter method
	{
		return make;
	}
	
	public String getmodel() //getter method
	{
		return model;
	}
	
	public String getyear() //getter method
	{
		return year;
	}
	

	public void display_info() //to display the attributes
	{
		System.out.println(" =======================");
		System.out.println(" Made By :"+make);
		System.out.println(" Model :" +model);
		System.out.println(" Year of Manufacturing:"+year);
		
	
	}
}

//child class 1
class Car extends Vehicle
{
	
	
	private int num_doors; 
	
	public Car(String make, String model,int year,int num_doors) //constructor
	{
		super(make,model,year);
		this.num_doors=num_doors;
	}
	
	public void setnum_doors(int num_doors) //setter method
	{
		this.num_doors=num_doors;
	}
	
	public int getnum_doors() //getter method
	{
		return num_doors;
	}
	
	
	public void display_info() // overriding of display method 
	{
		
		System.out.println(" Car details are :");
		super.display_info();
		System.out.println(" Number of Doors in Car are :"+num_doors);
	}

	
}

//child class 2
class Motorcycle extends Vehicle
{
	private double top_speed;
	
	public Motorcycle(String make,String model,int year,double top_speed) //constructor
	{
		super(make,model,year);
		this.top_speed=top_speed;
	}
	
	public void settop_speed(double top_speed) //setter method
	{
		this.top_speed=top_speed;
	}
	
	public double gettop_speed() //getter method
	{
		return top_speed;
	}
	
	
	public void display_info()  // overriding of display method
	{
		System.out.println(" \n\n\n Motorcycle details are :");
		super.display_info();
		System.out.println(" Maximum Speed of Motorcycle :"+top_speed+" km/hr");
	}
}


//main method
public class show {

	public static void main(String[] args) {
		
		// object creation
		Vehicle v=new Car("BMW"," Classic",2023,6);
		v.display_info();
		v=new Motorcycle("Honda"," Geared",2022,100);
		v.display_info();
		
		

	}

}

