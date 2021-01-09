import java.util.*;
public class PW9Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String ");
		String s1=sc.nextLine();
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		String t="";
		s1=s1.toLowerCase();    // To replace characters easily. 
		s2=s2.toLowerCase();   // To replace characters easily.
		String z=s1;
		for(int i=0;i<s2.length();++i)
		{
			t+=s2.charAt(i);
			z=z.replaceAll(t, "");
			t="";	
		}
		System.out.println(z);






	}
}
