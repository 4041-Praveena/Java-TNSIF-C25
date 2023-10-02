package task;

public class Task1 {

	public static void main(String[] args) 
	{
		 int m=30, n=248, p=1;
	     while(n!=0)
	     {
	         p=n%10;
	         m=m+n%p;
	         n=n/10;
	     }
	     System.out.println(m);
	}

}
