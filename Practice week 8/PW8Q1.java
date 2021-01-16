import java.util.*;
// A S V K VINAYAK
// CSE P
// 2023
public class PW8Q1 {

	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		String s="",ss="";
		System.out.println("Enter a String ");
		s=sc.nextLine();
		char ch;
		for(int i=0;i<s.length();++i)
		{
			ch=s.charAt(i);
			switch(ch)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				break;
			default :
				ss+=ch;		
			}
		}
		if(s.equalsIgnoreCase(ss))
			System.out.println("The string consists of no vowels");
		else
			System.out.println(ss);
}
}
