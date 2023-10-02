package Inheritance;

//base class
class Vehicle
{
	public String name;
	public String model;
	public int year;
	
	//method with parameters
	public void display_info(String name, String model, int year)
	{
	    System.out.println(" Name :"+name);
	    System.out.println(" Model :"+model);
	    System.out.println(" Year :"+year);
	}
}


//child class 1
class Car extends Vehicle
{
	public int num_doors;
	
	//method to display no.of.doors
	public void display_info(int num_doors)
	{
		System.out.println(" Number of Doors :"+num_doors);
	}

}


//child class 2	
class Motorcycle extends Vehicle
{
	public int top_speed;
	
    //method to display speed
	public void display_info(int top_speed)
	{	
		System.out.println(" Speed :"+top_speed);
	}
}


//main method class
class Show {

	public static void main(String[] args) {
		
		//instances for child class 1 and 2
		Car c =new Car();
		Motorcycle m = new Motorcycle();
		
		System.out.println(" \n Car Details are :\n");
		
		//calling methods 
		c.display_info("BMW","Classic",2020); //base class method
		c.display_info(5); //car class extra method
		System.out.println(" \n Motorcycle Details are :\n"); //base class method
		m.display_info("Hero","Classic",2023); //motorcycle class method
		m.display_info(100);
		

	}

}
