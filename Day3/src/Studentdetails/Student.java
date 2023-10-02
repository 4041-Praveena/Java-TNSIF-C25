package Studentdetails;

public class Student 
{
	private String Name;
	private int Rollnumber;
	private static  int TotalStudent;
	private static String CollegeName;
	 
	
	//Constructor
	public Student(String name,int roll)
	{
		Name=name;
		Rollnumber=roll;
	}
	
	//displaydetails method
	public void displaydetails()
	{
		System.out.println(Name+" "+Rollnumber);	
	}
	
	//static method
	
	 static
	 {
		 Student.CollegeName="St.Joseph College of Engineering";
		 System.out.println(CollegeName);
	 }
	 static int getTotalStudents()
	{
		   Student.TotalStudent=TotalStudent+1;
		  return TotalStudent;
	}
	 
	// convert object to string method
	public String toString()
	{
		return "\n     Student Name:"+Name+"\n     Roll Number:"+Rollnumber+"\n     Total no.of.Students:"+getTotalStudents();
	}

	//main method
	public static void main(String[] args) 
	{
		Student s1=new Student("Alice",1001);
		Student s2=new Student("Bobi",1002);
		Student s3=new Student("John",1003);
		Student s4=new Student("Revi",1004);
		Student s5=new Student("Dora",1005);
		System.out.println("\n Students Details are: \n");
		System.out.println("\n Student 1:"+s1+"\n");
		System.out.println("\n Student 2: "+s2+"\n");
		System.out.println("\n Student 3:"+s3+"\n");
		System.out.println("\n Student 4:"+s4+"\n");
		System.out.println("\n Student 5:"+s5+"\n");

	}

}
