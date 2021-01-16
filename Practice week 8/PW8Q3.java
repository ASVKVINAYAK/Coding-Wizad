import java.util.*;
//A S V K VINAYAK
//CSE P
//2023
public class PW8Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,a,b,n;
		System.out.println("Enter value of X ");
		x=sc.nextInt();
		System.out.println("Enter value of Y ");
		y=sc.nextInt();
		System.out.println("Enter value of A ");
		a=sc.nextInt();
		System.out.println("Enter value of B ");
		b=sc.nextInt();
		System.out.println("Enter value of N ");
		n=sc.nextInt();
	    int xc=0,yc=0,i,tt,max=0,z;
        if(x==y)  // if x==y we can remove x
      	{
   		xc=a+1;   
   	    }
        for(i=0;i<n;++i)
        {
        	z=(x-a)+(y-b);
        	if(z>=n)
        	{
	    	if(xc<=a)
	    	{
	    		xc++;
	    		x--;
	    	}
	    	if(yc<=b)
	    	{
	    		yc++;
	    		y--;
	    	}
	    	tt=Math.abs(x-y);
	    	if(tt>max)
	    		max=tt;
        	}
        }
        System.out.println(max);
	}
}
