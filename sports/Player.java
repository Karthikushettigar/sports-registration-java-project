package sports;
import java.util.*;
class Player
{
	String name,usn,email,no;
	Scanner sc=new Scanner(System.in);
    public void get()
    {
    	System.out.print("Name:");
    	name=sc.nextLine();
    	System.out.print("USN:");
    	usn=sc.nextLine();
    	System.out.print("E-mail Address:");
    	email=sc.nextLine();   
    	System.out.print("Phone Number:");
    	no=sc.nextLine();
    	System.out.println();
    }
}
class register extends Player
{
	String branch;
    void team(int n)
    {
    	System.out.print("Name of Branch:");
    	branch=sc.nextLine();
    	System.out.println("Enter Details of players:");
    	Player P[]=new Player[n];
    	for(int i=0;i<n;i++)
    	{ 
    		System.out.println("Player"+(i+1));
    		P[i]=new Player();
    		P[i].get();
    	}
    }
    void individual()
    {
    	System.out.print("Name of Branch:");
    	branch=sc.nextLine();
    	System.out.println("Enter Details of player for singles:");
    	Player Sc=new Player();
        Sc.get();
        System.out.println("Enter Details of players for doubles:");
        Player G[]=new Player[2];
        for(int i=0;i<2;i++)
        {
        	System.out.println("Player"+(i+1));
    		G[i]=new Player();
    		G[i].get();
        }
    }
}
class basketball extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Basketball Court,MITE");
		System.out.println("Number of Players:9");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
	
};
class badminton extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Badminton Court,MITE");
	    System.out.println("Registration Fees:Rs.200 for Singles");
	    System.out.println("Registration Fees:Rs.100 per player for Doubles");
	}
}
class football extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Main Ground,MITE");
		System.out.println("Number of Players:15");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
	
}
class khokho extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Greens,MITE");
		System.out.println("Number of Players:12");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
}
class kabaddi extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 1 and 2");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Main Ground,MITE");
		System.out.println("Number of Players:10");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
}
class rugby extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Main Ground,MITE");
		System.out.println("Number of Players:15");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
}
class cricket extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Main Ground,MITE");
		System.out.println("Number of Players:15");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
}
class tennis extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Tennis Court,MITE");
		System.out.println("Registration Fees:Rs.200 for Singles");
		System.out.println("Registration Fees:Rs.100 per player for Doubles");
	}
}
class tabletennis extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 3 and 4");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Hostel,MITE");
		System.out.println("Registration Fees:Rs.200 for Singles");
		System.out.println("Registration Fees:Rs.100 per player for Doubles");
	}
}
class volleyball extends register
{
	public void rule()
	{
		System.out.println("\nDate:January 2 and 3");
		System.out.println("Time:10:00am onwards");
		System.out.println("Venue:Volleyball Court,MITE");
		System.out.println("Number of Players:9");
		System.out.println("Registration Fees:Rs.100 per player ");
	}
}
