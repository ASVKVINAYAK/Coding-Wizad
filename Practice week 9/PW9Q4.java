import java.util.Scanner;

public class PW9Q4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter number ");
		n=sc.nextInt();
		String s="";
		int a,b,c,i;
		a=n/2+1;
		int z=a;
        b=1;
        c=2;
        i=1;
        s="1";
        String[] ss =new String[n];
        int k=0;
        while(i<=a)   // For printing upper part 
        {
        	for (int j = 1; j <=z; j++) 
                System.out.print(" "); 
        	ss[k]=s;          // To save the number
        	k++;
        	System.out.println(s);
        	s=c+s+c;
        	c++;
        	i++;	
        	--z;
        }
        i=k-2;
        while(i>=0)    // For Printing lower part
        {
        	for (int j=i;j<=k-1;++j) 
                System.out.print(" ");
        	
        	System.out.println(ss[i]);
        	--i; 
        }
	}
		
}
