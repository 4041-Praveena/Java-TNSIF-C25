package task;

public class Task3 {

	public static void main(String[] args) 
	{
		int p=5,q=8,r=4;
        if((p^9)<(10+p))
        {
            p=q+q;
        }
        else if((p&q&r)>(r&p))
        {
            q=(1+3)^r;
        }
        System.out.println(p+q+r);
		

	}

}
