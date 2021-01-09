public class Q3 {

	public static long chain(long n)
	{
		long c=1;
		do 
		{
			if(n%2==0)
				n=n/2;
			else
				n=3*n+1;
		 c++;	
		}while(n!=1);
		return c;
	}
	public static void main(String[] args)
	{
       long i,c=0,max=1;
       for(i=2;i<=1000000;++i)
       {
    	   c=chain(i);
    	   if(c>max)
    		   max=c;  
       }
       System.out.println(max);
	}

}
