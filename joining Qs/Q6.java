import java.util.*;
public class Q6 
{
	public static boolean prime(int n)
	{
		boolean f=true;
		for (int j=3;j<=Math.sqrt(n);j=j+2)
		{
			if (n % j==0)
			{
				f=false;
				break;
			}
		}
		return f;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long c=1;
		long p=0;
		int i;
		for(i=3;c<10001;i=i+2)
		{
			if(prime(i))
			{
				c++;
				p=i;
			}
		}
		System.out.println(p);

	}

}
