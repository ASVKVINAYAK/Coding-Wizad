import java.util.*;
//A S V K VINAYAK
//CSE P
//2023
public class PW8Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int temp,time,no;
		System.out.println("Enter the temperature of room in deg C: ");
		temp=sc.nextInt();
		System.out.println("Enter the times door opened :");
		no=sc.nextInt();
		System.out.println("Operating time of purifier in min :");
		time=sc.nextInt();
		if(no>time)
		{
			System.out.println("You can open door once per minute not more than that ! ");
			System.out.println("Enter the times door opened :");
			no=sc.nextInt();
		}
	    int x,y,z,pp;
	    x=(temp-25)*2;
	    y=(30+x)*no;
	    z=(time-no)*(40+x);
	    pp=y+z;
		System.out.println("Purifier purifies "+pp+" sq/min with the given conditions");
		
		
	}
}
