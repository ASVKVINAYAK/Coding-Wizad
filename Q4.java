import java.util.*;

public class Q4 {

	public static int feb(int y)
	{

		if ((y% 4 == 0 && y % 100 != 0 ) || (y % 400 == 0))
		{
            return 29;
        }
        else
        {
            return 28;
        }
	}
	public static int date(String s,int b)
	{
		s=s.toLowerCase();
		int a=31;
		int c=30;
		 if(s.equals("febuary"))
			return a;
		else if(s.equals("march"))
			return a+b;
		else if(s.equals("april"))
			return 2*a+b;
		else if(s.equals("may"))
			return 2*a+b+c;
		else if(s.equals("june"))
			return 3*a+b+c;
		else if(s.equals("july"))
			return 3*a+b+2*c;
		else if(s.equals("august"))
			return 4*a+b+2*c;
		else if(s.equals("september"))
			return 5*a+b+2*c;
		else if(s.equals("october"))
			return 5*a+b+3*c;
		else if(s.equals("november"))
			return 6*a+b+3*c;
		else if (s.equals("december"))
			return 6*a+b+4*c;
		 else
			 return 0;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        String suf=sc.next();
        String m=sc.next();
        int y=sc.nextInt();
        int b=feb(y);
        int z=date(m,b);
        int dd=d+z;
        System.out.println(dd);	
	}
}