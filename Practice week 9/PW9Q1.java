import java.util.*;;
public class PW9Q1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n,i,t,a,b,sum,c=0,x,y,z,f;
		System.out.println("Enter size of array ");
		n=sc.nextInt();
        int[] ar =new int[n];
        System.out.println("Enter elements ");
        for(i=0;i<n;++i)
        {
        	ar[i]=sc.nextInt();
        }
        System.out.println("Enter sum ");
        sum=sc.nextInt();
        a=0;
        b=0;
        t=0;
        z=0;
        y=n-1;
        f=0;
        while(z<y)
        {
        	a=ar[z];
            b=ar[y];
            t=sum-a-b;
            for(i=0;i<n;++i)
            {
            	if(t==ar[i])
            	{
            		f=1;
            	}
            }
            z++;
            y--;
            if(f==1)
            	break;
        }
        if(f==1)
        {
        	System.out.println(a+","+t+","+b);
        }
        else
        {
        	System.out.println("Triplet not found ");
        }
        
        






	}
}
