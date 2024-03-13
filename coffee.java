package p1;

public class coffee extends milk
{
	void Coffee()
	{
		System.out.println("--->COFFEE<---");
		System.out.println("------------------------------------");
	 	System.out.println("1.Instant Coffee..............20 ₹");
	 	System.out.println("2.Filter Coffee...............20 ₹");
	 	System.out.println("3.Black Coffee................20 ₹");
	 	System.out.println("4.Chocolate Coffee............25 ₹");
 	    System.out.println("5.Cold Coffee.................80 ₹");
	    System.out.println("6.Cappuccino..................80 ₹");
	    System.out.println("--------------------------------------");
	   	System.out.println("7.Main Menu");
	    System.out.println("please enter Given item Number only");
	    System.out.println("------------------------------------");
	    this.meth2();
	  }
	void meth2()
	{
		String c=sc.next();
		switch(c)
		{
		case "1":
			System.out.println("you selected Instant Coffee..............20 ₹");
			Items[9]="Instant Coffee";
			rate[9]=20;
			System.out.println("how many cups you want ?");
			qunt[9]=sc.nextInt();
			bill[9]=qunt[9]*rate[9];
			System.out.println("===>your bill on Instant Coffee="+bill[9]+" ₹");
     	    System.out.println("-------------------------------------------");
     		System.out.println("If you want any other item? ");
     		System.out.println("In this Menu press 1");
     		System.out.println("Go to Main Menu press 2");
     	    System.out.println("Go to total bill press 3");
     		System.out.println("Enter your choice ");
     		System.out.println("-------------------------------------------");
     		String A=sc.next();
     		switch(A)
     		{
     		case "1":
     			this.Coffee();
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
     	     		 this.Coffee();
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
     		 System.out.println("you selected Filter Coffee...............20 ₹");
     		 Items[10]="Filter Coffee";
     		 rate[10]=20;
      		 System.out.println("how many cups you want ?");
      		 qunt[10]=sc.nextInt();
     		 bill[10]=qunt[10]*rate[10];
     		 System.out.println("===>your bill on Filter Coffee="+bill[10]+" ₹");
     		 System.out.println("-------------------------------------------");
     		 System.out.println("If you want any other item? ");
     		 System.out.println("In this Menu press 1");
     		 System.out.println("Go to Main Menu press 2");
     		 System.out.println("Go to total bill press 3");
     		 System.out.println("Enter your choice ");
     		 System.out.println("--------------------------------------------");
     		 String A1=sc.next();
     		 switch(A1)
     		 {
     		 case "1":
     			 this.Coffee();
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
     	     		 this.Coffee();
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
     	 case "3":
     		 System.out.println("you selected Black Coffee................20 ₹");
     		 Items[11]="Black Coffee";
     		 rate[11]=20;
     		 System.out.println("how many cups you want ?");
     		 qunt[11]=sc.nextInt();
     		 bill[11]=qunt[11]*rate[11];
     		 System.out.println("===>your bill on Black Coffee="+bill[11]+" ₹");
     		 System.out.println("-------------------------------------------");
     		 System.out.println("If you want any other item? ");
     		 System.out.println("In this Menu press 1");
     		 System.out.println("Go to Main Menu press 2");
     		 System.out.println("Go to total bill press 3");
     		 System.out.println("Enter your choice ");
     		 System.out.println("-----------------------------------------");
     		 String A2=sc.next();
     		 switch(A2)
     		 {
     		 case "1":
     			 this.Coffee();
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
     	     			 this.Coffee();
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
     		 System.out.println("you selected Chocolate Coffee............25 ₹");
     		 Items[12]="Chocolate Coffee";
     		 rate[12]=25;
     		 System.out.println("how many cups you want ?");
     		 qunt[12]=sc.nextInt();
     		 bill[12]=qunt[12]*rate[12];
     		 System.out.println("===>your bill on Chocolate Coffee="+bill[12]+" ₹");
     		 System.out.println("----------------------------------------------");
     		 System.out.println("If you want any other item? ");
     		 System.out.println("In this Menu press 1");
     		 System.out.println("Go to Main Menu press 2");
     		 System.out.println("Go to total bill press 3");
     		 System.out.println("Enter your choice ");
     		 System.out.println("----------------------------------------------");
     		 String A3=sc.next();
     		 switch(A3)
     		 {
     		 case "1":
     			 this.Coffee();
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
     	     		 this.Coffee();
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
     		 System.out.println("you selected Cold Coffee.................80 ₹");
     		 Items[13]="Cold Coffee";
     		 rate[13]=80;
     		 System.out.println("how many cups you want ?");
     		 qunt[13]=sc.nextInt();
     		 bill[13]=qunt[13]*rate[13];
     		 System.out.println("===>your bill on Cold Coffee="+bill[13]+" ₹");
     		 System.out.println("-----------------------------------------");
     		 System.out.println("If you want any other item? ");
     		 System.out.println("In this Menu press 1");
     		 System.out.println("Go to Main Menu press 2");
     		 System.out.println("Go to total bill press 3");
     		 System.out.println("Enter your choice ");
     		 System.out.println("-----------------------------------------");
     		 String A4=sc.next();
     		 switch(A4)
     		 {
     		 case "1":
     			 this.Coffee();
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
     	     		 this.Coffee();
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
     		 System.out.println("you selected Cappuccino..................80 ₹");
     		 Items[14]="Cappuccino Coffee";
     		 rate[14]=80;
     		 System.out.println("how many cups you want ?");
     		 qunt[14]=sc.nextInt();
     		 bill[14]=qunt[14]*rate[14];
     		 System.out.println("===>your bill on Cappuccino="+bill[14]+" ₹");
     		 System.out.println("----------------------------------------");
     		 System.out.println("If you want any other item? ");
     		 System.out.println("In this Menu press 1");
     		 System.out.println("Go to Main Menu press 2");
     		 System.out.println("Go to total bill press 3");
     		 System.out.println("Enter your choice ");
     		 System.out.println("----------------------------------------");
     		 String A5=sc.next();
     		 switch(A5)
     		 {
     		 case "1":
     			 this.Coffee();
     			 break;
     		 case "2":
     			new Friends_Masthi_Chai().Main_menu();
     			break;
     		 case "3":
     			 break;
     		 default:
     	          System.out.println("Invaild entry (enter  Given item Number only)");
     	          String a=sc.next();
     	     	  switch(a)
     	     	  {
     	     	  case "1":
     	     		  this.Coffee();
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
     		new Friends_Masthi_Chai().Main_menu();
	        break;
     	default:
     		 System.out.println("Invalid  entry (enter  Given item Number only)");
     		 this.meth2();
     		 break;
			}
	}
}