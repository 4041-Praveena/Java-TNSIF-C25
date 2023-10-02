package Inheritance.task3;


//base class
class Employee
{
	private String name;
	private int employee_id;
	
	public Employee(String name,int employee_id) //constructor
	{
		this.name=name;
		this.employee_id=employee_id;
	}
	
	public void setname( String name) //setter method
	{
		this.name=name;
	}
	
	public void setemployee_id( int employee_id) //setter method
	{
		this.employee_id=employee_id;
	}
	
	public String getname() //getter method
	{
		return name;
	}
	
	public int getemployee_id() //getter method
	{
		return employee_id;
	}
	
	public void displayDetails() //to display the attributes
	{
		System.out.println(" =======================");
		System.out.println(" Name of the Employee :"+name);
		System.out.println(" Employee ID :" +employee_id);
		
	}
}

//child class 1
class Manager extends Employee
{
	
	
	private String dept; 
	
	public Manager(String name ,int employee_id,String dept) //constructor
	{
		super(name,employee_id);
		this.dept=dept;
	}
	
	public void setdept(String dept) //setter method
	{
		this.dept=dept;
	}
	
	public String dept() //getter method
	{
		return dept;
	}
	
	
	public void displayDetails() // overriding of display method 
	{
		
		System.out.println(" Manager details are :");
		super.displayDetails();
		System.out.println(" Department of the Manager :"+dept);
	}

	
}

//child class 2
class Technician extends Employee
{
	private String spec;
	
	public Technician(String name,int employee_id,String spec) //constructor
	{
		super(name,employee_id);
		this.spec=spec;
	}
	
	public void setspec(String spec) //setter method
	{
		this.spec=spec;
	}
	
	public String getspec() //getter method
	{
		return spec;
	}
	
	
	public void displayDetails()  // overriding of display method
	{
		System.out.println(" \n\n\nTechnician details are :");
		super.displayDetails();
		System.out.println(" Specialization of the Technician :"+spec);
	}
}


//main method
public class show {

	public static void main(String[] args) {
		
		// object creation
		Employee e=new Manager("Abinaya",551,"Developer");
		e.displayDetails();
		e=new Technician("Abinav",685," Java");
		e.displayDetails();
		
		

	}

}



