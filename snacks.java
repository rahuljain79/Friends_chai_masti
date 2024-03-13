package p1;
import java.util.Scanner;

public class snacks extends bill
{
	Scanner sc=new Scanner(System.in);
		 void Snacks()
		 {
			 System.out.println("--->SNACKS<---");
			 System.out.println("-------------------------------------");
		   	 System.out.println("1.Osmania Biscuti(3)..........10 ₹");
		   	 System.out.println("2.Aloo Samosa.................10 ₹");
		   	 System.out.println("3.Small Samosa(4).............20 ₹");
		   	 System.out.println("4.French Fries................50 ₹");
		   	 System.out.println("--------------------------------------");
		   	 System.out.println("5.Main Menu");
		   	 System.out.println("please enter Given item Number only");
		   	 System.out.println("--------------------------------------");
		   	 this.meth6();
		   	}
	   void meth6()
	   {
		   String sa=sc.next();
		   if(sa.equals("1"))
		   	 {
		   		 System.out.println("you selected Osmania Biscuti(3)..........10 ₹");
		   		 Items[30]="Osmania Biscuti(3)";
		   		 rate[30]=10;
				 System.out.println("how many you want ?");
				 qunt[30]=sc.nextInt();
				 bill[30]=qunt[30]*rate[30];
				 System.out.println("===>your bill on Osmania Biscuti="+bill[30]+" ₹");
		   		 System.out.println("---------------------------------------------");
		   		 System.out.println("If you want any other item? ");
		   		 System.out.println("In this Menu press 1");
		   		 System.out.println("Go to Main Menu press 2");
		   		 System.out.println("Go to total bill press 3");
		   		 System.out.println("Enter your choice ");
		   		 System.out.println("---------------------------=------------------");
		   		String A1=sc.next();
		   		if(A1.equals("1"))
		   			this.Snacks();
		   		else if(A1.equals("2"))
		   			new Friends_Masthi_Chai().Main_menu();
		   		else if(A1.equals("3"));
		   		else
		   		{
		   			System.out.println("Invalid entry (enter  Given item Number only)");
		   			String a1=sc.next();
			   		if(a1.equals("1"))
			   			this.Snacks();
			   		else if(a1.equals("2"))
			   			new Friends_Masthi_Chai().Main_menu();
			   		else if(a1.equals("3"));
			   		else
			   			System.out.println("Invalid entry (enter  Given item Number only)");
		   			
		   		}
		   		 
		   	 }
		   	 else if(sa.equals("2"))
		   	 {
		   		 System.out.println("you selected Aloo Samosa.................10/-");
		   		 Items[31]="Aloo Samosa";
		   		 rate[31]=10;
				 System.out.println("how many you want ?");
				 qunt[31]=sc.nextInt();
				 bill[31]=qunt[31]*rate[31];
				 System.out.println("===>your bill on Aloo Samosa="+bill[31]+" ₹");
		   		 System.out.println("-----------------------------------------");
		   		 System.out.println("If you want any other item? ");
		   		 System.out.println("In this Menu press 1");
		   		 System.out.println("Go to Main Menu press 2");
		   		 System.out.println("Go to total bill press 3");
		   		 System.out.println("Enter your choice ");
		   		 System.out.println("------------------------------------------");
		   		String A1=sc.next();
		   		if(A1.equals("1"))
		   			this.Snacks();
		   		else if(A1.equals("2"))
		   			new Friends_Masthi_Chai().Main_menu();
		   		else if(A1.equals("3"));
		   		else
		   		{
		   			System.out.println("Invalid entry (enter  Given item Number only)");
		   			String a1=sc.next();
			   		if(a1.equals("1"))
			   			this.Snacks();
			   		else if(a1.equals("2"))
			   			new Friends_Masthi_Chai().Main_menu();
			   		else if(a1.equals("3"));
			   		else
			   			System.out.println("Invalid entry (enter  Given item Number only)");
		   		}
		   	 }
		   	else if(sa.equals("3"))
		   	 {
		   		 System.out.println("you selected Small Samosa(4).............20/-");
		   		 Items[32]="Small Samosa(4)";
		   		 rate[32]=20;
				 System.out.println("how many you want ?");
				 qunt[32]=sc.nextInt();
				 bill[32]=qunt[32]*rate[32];
				 System.out.println("===>your bill on Small Samosa="+bill[32]+" ₹");
		   		 System.out.println("------------------------------------------");
		   		 System.out.println("If you want any other item? ");
		   		 System.out.println("In this Menu press 1");
		   		 System.out.println("Go to Main Menu press 2");
		   		 System.out.println("Go to total bill press 3");
		   		 System.out.println("Enter your choice ");
		   		 System.out.println("------------------------------------------");
		   		String A1=sc.next();
		   		if(A1.equals("1"))
		   			this.Snacks();
		   		else if(A1.equals("2"))
		   			new Friends_Masthi_Chai().Main_menu();
		   		else if(A1.equals("3"));
		   		else
		   		{
		   			System.out.println("Invalid entry (enter  Given item Number only)");
		   			String a1=sc.next();
			   		if(a1.equals("1"))
			   			this.Snacks();
			   		else if(a1.equals("2"))
			   			new Friends_Masthi_Chai().Main_menu();
			   		else if(a1.equals("3"));
			   		else
			   			System.out.println("Invalid entry (enter  Given item Number only)");
		   		}
		   		 
		   	 }
		   	else if(sa.equals("4"))
		   	 {
		   		 System.out.println("you selected French Fries................50 ₹");
		   		 Items[33]="French Fries";
		   		 rate[33]=50;
				 System.out.println("how many you want ?");
				 qunt[33]=sc.nextInt();
				 bill[33]=qunt[33]*rate[33];
				 System.out.println("===>your bill on French Frie="+bill[33]+" ₹");
		   		 System.out.println("-----------------------------------------");
		   		 System.out.println("If you want any other item? ");
		   		 System.out.println("In this Menu press 1");
		   		 System.out.println("Go to Main Menu press 2");
		   		 System.out.println("Go to total bill press 3");
		   		 System.out.println("Enter your choice ");
		   		 System.out.println("-----------------------------------------");
		   		String A1=sc.next();
		   		if(A1.equals("1"))
		   			this.Snacks();
		   		else if(A1.equals("2"))
		   			new Friends_Masthi_Chai().Main_menu();
		   		else if(A1.equals("3"));
		   		else
		   		{
		   			System.out.println("Invalid entry (enter  Given item Number only)");
		   			String a1=sc.next();
			   		if(a1.equals("1"))
			   			this.Snacks();
			   		else if(a1.equals("2"))
			   			new Friends_Masthi_Chai().Main_menu();
			   		else if(a1.equals("3"));
			   		else
			   			System.out.println("Invalid entry (enter  Given item Number only)");
		   		}
		   		 
		   	 }
		   	else if(sa.equals("5"))
		   		new Friends_Masthi_Chai().Main_menu();
		   	else
		   	{
		   		 System.out.println("Invalid entry (enter  Given item Number only)");
		   		 this.meth6();
		   	}
		}
}
