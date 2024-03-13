package p1;

public class chai extends coffee
{
	void Chai() 
	{
		System.out.println("--->CHAI(TEA)<---");
		System.out.println("-------------------------------");
		System.out.println("1.Normal Tea..............10 ₹");
		System.out.println("2.Bellam Tea..............15 ₹");
		System.out.println("3.Masala Tea..............15 ₹");
		System.out.println("4.Lemon Tea...............15 ₹");
		System.out.println("5.Ginger Tea..............20 ₹");
		System.out.println("6.Elaichi Tea.............20 ₹");
		System.out.println("7.Badam Tea...............20 ₹");
		System.out.println("8.Green Tea...............20 ₹");
		System.out.println("9.Miryalu Tea.............20 ₹");
		System.out.println("-------------------------------------");
		System.out.println("10.Main Menu");
		System.out.println("please enter Given item Number only");
		System.out.println("-------------------------------------");
		this.meth1();
		}
	void meth1()
	{
		String t=sc.next();
		switch(t)
		{
		case "1":
			System.out.println("you selected Normal Tea..............10 ₹");
			Items[0]="Normal Tea";
			rate[0]=10;
		    System.out.println("how many cups you want ?");
		    qunt[0]=sc.nextInt();
		    bill[0]=qunt[0]*rate[0];
		    System.out.println("===>your bill on Normal Tea="+bill[0]+" ₹");
		    System.out.println("-----------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu  press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice ");
		    System.out.println("------------------------------------------");
		    String A=sc.next();
		    switch(A)
		    {
		    case "1":
		    	this.Chai();
		    	break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		    	break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a=sc.next();
			    switch(a)
			    {
			    case "1":
			    	Chai();
			    	break;
			    case "2":
					new Friends_Masthi_Chai().Main_menu();
			    	break;
			    case "3":
			    	break;
			    default:
			    	System.out.println("Invalid entry (enter  Given item Number only)");
			    	break;
			    }
		    }
		    break;
		 case "2":
			 System.out.println("you selected Bellam Tea..............15 ₹");
			 Items[1]="Bellam Tea";
			 rate[1]=15;
			 System.out.println("how many cups you want ?");
			 qunt[1]=sc.nextInt();
			 bill[1]=qunt[1]*rate[1];
			 System.out.println("===>your bill on Bellam Tea="+bill[1]+" ₹");
			 System.out.println("---------------------------------------");
			 System.out.println("If you want any other item? ");
			 System.out.println("In this Menu  press 1");
			 System.out.println("Go to Main Menu press 2");
			 System.out.println("Go to total bill press 3");
			 System.out.println("Enter your choice");
			 System.out.println("---------------------------------------");
			 String A1=sc.next();
			 if(A1.equals("1"))
				 this.Chai();
			 else if(A1.equals("2"))
				 new Friends_Masthi_Chai().Main_menu();
			 else if(A1.equals("3"))
				 Bill();
			 else
			 {
				 System.out.println("Invalid entry (enter  Given item Number only)");
				 String a1=sc.next();
			     if(a1.equals("1"))
			    	 this.Chai();
			     else if(a1.equals("2"))
			    	 new Friends_Masthi_Chai().Main_menu();
			     else if(a1.equals("3"))
			    	 break;
			     else
			    	 System.out.println("Invalid entry (enter  Given item Number only)");
			     }
		    break;
		 case "3":
			 System.out.println("you selected Masala Tea..............15/-");
			 Items[2]="Masala Tea";
		     rate[2]=15;
		     System.out.println("how many cups you want ?");
		     qunt[2]=sc.nextInt();
		     bill[2]=qunt[2]*rate[2];
			 System.out.println("===>your bill on Masala Tea="+bill[2]+" ₹");
			 System.out.println("---------------------------------------");
			 System.out.println("If you want any other item? ");
			 System.out.println("In this Menu  press 1");
			 System.out.println("Go to Main Menu press 2");
			 System.out.println("Go to total bill press 3");
			 System.out.println("Enter your choice");
			 System.out.println("---------------------------------------");
			 String A2=sc.next();
			 switch(A2)
			 {
			 case "1":
				 this.Chai();
				 break;
			case "2":
				new Friends_Masthi_Chai().Main_menu();
			    break;
			case "3":
			    break;
		    default:
			    System.out.println("Invalid entry (enter  Given item Number only)");
			    String a2=sc.next();
			    switch(a2)
			    {
			    case "1":
			    	this.Chai();
					break;
			    case "2":
			    	new Friends_Masthi_Chai().Main_menu();
					break;
			    case "3":
					break;
				default:
					System.out.println("Invalid entry (enter  Given item Number only)");
					break;
					}
			    }
			  break;
		case "4":
			System.out.println("you selected Lemon Tea...............15 ₹");
			Items[3]="Lemon Tea";
			rate[3]=15;
		    System.out.println("how many cups you want ?");
		    qunt[3]=sc.nextInt();
		    bill[3]=qunt[3]*rate[3];
		    System.out.println("===>your bill on Lemon Tea="+bill[3]+" ₹");
		    System.out.println("--------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu  press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice");
		    System.out.println("--------------------------------------");
		    String A3=sc.next();
		    switch(A3)
		    {
		    case "1":
		    	this.Chai();
		    	break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		    	break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a3=sc.next();
				    switch(a3)
				    {
				    case "1":
				    	this.Chai();
				    	break;
				    case "2":
						new Friends_Masthi_Chai().Main_menu();
				    	break;
				    case "3":
				    	break;
				    default:
				    	System.out.println("Invalid entry (enter  Given item Number only)");
				    	break;
				    }
		    }
		    break;
		case "5":
			System.out.println("you selected Ginger Tea..............20 ₹");
			Items[4]="Masala Tea";
			rate[4]=20;
		    System.out.println("how many cups you want ?");
		    qunt[4]=sc.nextInt();
		    bill[4]=qunt[4]*rate[4];
		    System.out.println("===>your bill on Ginger Tea="+bill[4]+" ₹");
		    System.out.println("---------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice");
		    System.out.println("---------------------------------------");
		    String A4=sc.next();
		    switch(A4)
		    {
		    case "1":
		    	this.Chai();
		    	break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		    	break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a3=sc.next();
			    switch(a3)
			    {
			    case "1":
			    	this.Chai();
			    	break;
			    case "2":
					new Friends_Masthi_Chai().Main_menu();
			    	break;
			    case "3":
			    	break;
			    default:
			    	System.out.println("Invalid entry (enter  Given item Number only)");
			    	break;
			    }
		    }
		    break;
		case "6":
			System.out.println("you selected Elaichi Tea.............20 ₹");
			Items[5]="Elaichi Tea";
			rate[5]=20;
		    System.out.println("how many cups you want ?");
		    qunt[5]=sc.nextInt();
		    bill[5]=qunt[5]*rate[5];
		    System.out.println("===>your bill on Elaichi Tea="+bill[5]+" ₹");
		    System.out.println("----------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu  press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice");
		    System.out.println("----------------------------------------");
		    String A5=sc.next();
		    switch(A5)
		    {
		    case "1":
		    	this.Chai();
		    	break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		    	break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a3=sc.next();
			    switch(a3)
			    {
			    case "1":
			    	this.Chai();
			    	break;
			    case "2":
					new Friends_Masthi_Chai().Main_menu();
			    	break;
			    case "3":
			    	break;
			    default:
			    	System.out.println("Invalid entry (enter  Given item Number only)");
			    	break;
			    }
		    }
		    break;
		case "7":
			System.out.println("you selected Badam Tea...............20 ₹");
			Items[6]="Badam Tea";
			rate[6]=20;
		    System.out.println("how many cups you want ?");
		    qunt[6]=sc.nextInt();
		    bill[6]=qunt[6]*rate[6];
		    System.out.println("===>your bill on Badam Tea="+bill[6]+" ₹");
		    System.out.println("--------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu  press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice");
		    System.out.println("--------------------------------------");
		    String A6=sc.next();
		    switch(A6)
		    {
		    case "1":
		    	this.Chai();
		    	break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		        break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a3=sc.next();
			    switch(a3)
			    {
			    case "1":
			    	this.Chai();
			    	break;
			    case "2":
					new Friends_Masthi_Chai().Main_menu();
			    	break;
			    case "3":
			    	break;
			    default:
			    	System.out.println("Invalid entry (enter  Given item Number only)");
			    	break;
			    }
		    }
		    break;
		case "8":
		    System.out.println("you selected Green Tea...............20 ₹");
		    Items[7]="Green Tea";
		    rate[7]=20;
		    System.out.println("how many cups you want ?");
		    qunt[7]=sc.nextInt();
		    bill[7]=qunt[7]*rate[7];
		    System.out.println("===>your bill on Green Tea="+bill[7]+" ₹");
		    System.out.println("--------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu  press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice");
		    System.out.println("--------------------------------------");
		    String A7=sc.next();
		    switch(A7)
		    {
		    case "1":
		    	this.Chai();
		    	break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		    	break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a3=sc.next();
			    switch(a3)
			    {
			    case "1":
			    	this.Chai();
			    	break;
			    case "2":
					new Friends_Masthi_Chai().Main_menu();
			    	break;
			    case "3":
			    	break;
			    default:
			    	System.out.println("Invalid entry (enter  Given item Number only)");
			    	break;
			    }
		   }
		   break;
		case "9":
			System.out.println("you selected Miryalu Tea.............20 ₹");
			Items[8]="Miryalu Tea";
			rate[8]=20;
		    System.out.println("how many cups you want ?");
		    qunt[8]=sc.nextInt();
		    bill[8]=qunt[8]*rate[8];
		    System.out.println("===>your bill on Miryalu Tea="+bill[8]+" ₹");
		    System.out.println("----------------------------------------");
		    System.out.println("If you want any other item? ");
		    System.out.println("In this Menu  press 1");
		    System.out.println("Go to Main Menu press 2");
		    System.out.println("Go to total bill press 3");
		    System.out.println("Enter your choice");
		    System.out.println("----------------------------------------");
		    String A8=sc.next();
		    switch(A8)
		    {
		    case "1":
		    	this.Chai();
		        break;
		    case "2":
				new Friends_Masthi_Chai().Main_menu();
		        break;
		    case "3":
		    	break;
		    default:
		    	System.out.println("Invalid entry (enter  Given item Number only)");
		    	String a3=sc.next();
			    switch(a3)
			    {
			    case "1":
			    	this.Chai();
			    	break;
			    case "2":
					new Friends_Masthi_Chai().Main_menu();
			    	break;
			    case "3":
			    	break;
			    default:
			    	System.out.println("Invalid entry (enter  Given item Number only)");
			    	break;
			    }
		    }
		    break;
	   case "10":
		   new Friends_Masthi_Chai().Main_menu();
	        break;
		default:
			System.out.println("Invalid entry (enter  Given item Number only)");
			this.meth1();
		    break;
		}
	}
}