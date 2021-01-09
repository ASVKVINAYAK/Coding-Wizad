import java.util.*;
public class Q1 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,j,f;;
        j=s.length();
        char ch=' ';
        String ss="";
        s=s.toUpperCase();
        for(i=0;i<j;++i)
        {
        	ch=s.charAt(i);
        	if(ch=='G')
        		ss=ss+"C";
        	else if(ch=='T')
        		ss=ss+"A";
        	else if(ch=='C')
        		ss=ss+"G";
        	else if(ch=='A')
        		ss=ss+"U";	
        }
        f=ss.length();
        if(j==f)
        	System.out.println(ss);
        else
         System.out.println("Invalid Input");
	}
}
