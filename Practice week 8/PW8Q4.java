import java.util.*;
//A S V K VINAYAK
//CSE P
//2023
public class PW8Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter value of N ");
		n=sc.nextInt();
		int[][] a=new int[n][n];
		for(int i=0;i<n;++i)
		{
			
			for(int j=0;j<n;++j)
			{
			    if(i==j)
			    a[i][i]=1;
				else
				a[j][n-j-1]=1;
			}
		}
		if(n%2!=0)
		{
			a[n/2][0]=1;
			a[0][n/2]=1;
		}

		for (int i = 0; i < n; i++) 
		  {
		    for (int j = 0; j < n; j++)
		    {
		      System.out.print(a[i][j] + " ");
		    }
		    System.out.println();
		  }
	
	
	
	
	}
}
