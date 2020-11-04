import java.util.Scanner;

public class Q2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[] s=new char[3];
		System.out.println('P'*'R');
        s[0]='R';
        s[1]='P';
        s[2]='S';
        int sy;
        char sys;
        char hum;
        int i=1,hc=0,scc=0,f=0,z=0;
        while(i<=3)
        {
        	if((hc*scc*f)==1) //As hc==1&&scc==1&&f==1 is same as hc*scc*f==1
        	{
        		System.out.println("Tie of Game");
        		z=1;
        		break;
        	}
        	System.out.println("Round "+i);
        	System.out.println("Enter User’s choice: (P|R|S) ");
        	hum=sc.next().charAt(0);
        	sy= (int) Math.round(Math.random() * 2);
        	sys=s[sy];
            System.out.println("Computer’s choice (randomly generated)");
            System.out.println(sys);
        	 if(hum=='R' && sys=='S')
        	     hc++;
        	     else if(hum=='R' && sys=='P')
          	           scc++;
        	        else if(hum=='R' && sys=='R')
        	        {	System.out.println("Tie of round"); f=1; } 
        	 
        	  else if(hum=='P' && sys=='R')
          	       hc++;
          	         else if(hum=='P' && sys=='S')
                    	  scc++;
                      	else if(hum=='P' && sys=='P')
                      	{	System.out.println("Tie of round"); f=1; }
        	 
          	else if(hum=='S' && sys=='P')
            	  hc++;
            	else if(hum=='S' && sys=='R')
              	  scc++;
            	else if(hum=='S' && sys=='S')
            	{	System.out.println("Tie of round"); f=1; }
        	i++;	
        }
        if(z==0)
        {	
        if(hc>scc)
        {
        	System.out.println("User won the round");
        	System.out.println("3 Rounds over, User scored "+hc+" , user won the game");
        }
        else
        {
        	System.out.println("User lost  the round");
        	System.out.println("3 Rounds over, User scored "+hc+" , lost the game..");
          }
        }
      }
}
