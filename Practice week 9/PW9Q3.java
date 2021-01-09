import java.util.Scanner;

public class PW9Q3 {

	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter number ");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("Roman number system does not contain the number 0");
		}
		else
		{
		String a[] = {"", "M", "MM", "MMM"};
	     String b[] = {"", "C", "CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "CM"};
	     String c[] = {"", "X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"};
	     String d[] = {"", "I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX"};
	     String thousand = a[num/1000];
	     String hundered = b[(num%1000)/100];
	     String ten =  c[(num%100)/10];
	     String one = d[num%10]; 
	     String ans = thousand + hundered + ten + one;
	     System.out.println(ans);
		}

	}

}
