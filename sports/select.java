package sports;
import java.util.*;
public class select {
	public static void main(String[] args)
	{
		System.out.println("SPORTS REGISTRATION\n");
		System.out.println("List of Sports Event:");
		int choice;
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Basketball");
		System.out.println("2.Badminton");
		System.out.println("3.Football");
		System.out.println("4.Kho-Kho");
		System.out.println("5.Kabaddi");
		System.out.println("6.Rugby");
		System.out.println("7.Cricket");
		System.out.println("8.Tennis");
		System.out.println("9.Table Tennis");
		System.out.println("10.Volleyball");
		System.out.println();
		System.out.print("Select the desired sport:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			basketball b=new basketball();
			b.rule();
			System.out.println();
			b.team(9);
			break;
		}
		case 2:
		{
			badminton bd=new badminton();
			bd.rule();
			System.out.println();
			bd.individual();
			break;
		}
		case 3:
		{
			football f =new football();
			f.rule();
			System.out.println();
			f.team(15);
			break;
		}
		case 4:
		{
			khokho k =new khokho();
			k.rule();
			System.out.println();
			k.team(12);
			break;
		}
		case 5:
		{
			kabaddi kd=new kabaddi();
			kd.rule();
			System.out.println();
			kd.team(10);
			break;
		}
		case 6:
		{
			rugby r= new rugby();
			r.rule();
			System.out.println();
			r.team(15);	
			break;
		}
		case 7:
		{
			cricket c = new cricket();
			c.rule();
			System.out.println();
			c.team(15);
			break;
		}
		case 8:
			
		{
			tennis t= new tennis();
			t.rule();
			System.out.println();
			t.individual();
			break;
		}
		case 9:
		{
			tabletennis TT=new tabletennis();
			TT.rule();
			System.out.println();
			TT.individual();
			break;
		}
		case 10:
		{
			volleyball v= new volleyball();
			v.rule();
			System.out.println();
			v.team(9);
			break;
		}
	}
	System.out.println("Thanks for registration ");
	}

}
