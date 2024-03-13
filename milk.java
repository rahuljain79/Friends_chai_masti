package p1;

public class milk extends lassi
{
	 void Milk()
	 {
		 System.out.println("--->MILK<---");
		 System.out.println("-----------------------------------");
		 System.out.println("1.Milk...................15 ₹");
		 System.out.println("2.Miryalu Milk...........20 ₹");
		 System.out.println("3.Horlicks...............20 ₹");
		 System.out.println("4.Boost..................20 ₹");
		 System.out.println("5.Rose Milk..............30 ₹");
		 System.out.println("6.Badam Milk.............30 ₹");
		 System.out.println("--------------------------------------");
	   	 System.out.println("7.Main Menu");
		 System.out.println("please enter Given item Number only");
		 System.out.println("-------------------------------------");
		 this.meth3();
		 }
	 void meth3() 
	 {
		 String m=sc.next();
		 switch(m)
		 {
		 case "1":
			 System.out.println("you selected Milk...................15 ₹");
			 Items[15]="MILK";
			 rate[15]=15;
	 		 System.out.println("how many cups you want ?");
	 		 qunt[15]=sc.nextInt();
	 		 bill[15]=qunt[15]*rate[15];
	 		 System.out.println("===>your bill on Milk="+bill[15]+" ₹");
			 System.out.println("----------------------------------");
			 System.out.println("If you want any other item? ");
			 System.out.println("In this Menu press 1");
			 System.out.println("Go to Main Menu press 2");
			 System.out.println("Go to total bill press 3");
			 System.out.println("Enter your choice ");
			 System.out.println("----------------------------------");
			 String A1=sc.next();
			 switch(A1)
			 {
			 case "1":
				 this.Milk();
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
	         		this.Milk();
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
		 System.out.println("you selected Miryalu Milk...........20 ₹");
		 Items[16]="Miryalu MILK";
		 rate[16]=20;
 		 System.out.println("how many cups you want ?");
 		 qunt[16]=sc.nextInt();
 		 bill[16]=qunt[16]*rate[16];
 		 System.out.println("===>your bill on Miryalu Milk="+bill[16]+" ₹");
		 System.out.println("------------------------------------------");
		 System.out.println("If you want any other item? ");
		 System.out.println("In this Menu press 1");
		 System.out.println("Go to Main Menu press 2");
		 System.out.println("Go to total bill press 3");
		 System.out.println("Enter your choice ");
		 System.out.println("------------------------------------------");
		 String A2=sc.next();
		 switch(A2)
		 {
		 case "1":
			 this.Milk();
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
	        	 this.Milk();
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
		 System.out.println("you selected Horlicks...............20 ₹");
		 Items[17]="Horlicks";
		 rate[17]=20;
 		 System.out.println("how many cups you want ?");
 		 qunt[17]=sc.nextInt();
 		 bill[17]=qunt[17]*rate[17];
 		 System.out.println("===>your bill on Horlicks="+bill[17]+" ₹");
		 System.out.println("--------------------------------------");
		 System.out.println("If you want any other item? ");
		 System.out.println("In this Menu press 1");
		 System.out.println("Go to Main Menu press 2");
		 System.out.println("Go to total bill press 3");
		 System.out.println("Enter your choice ");
		 System.out.println("--------------------------------------");
		 String A3=sc.next();
		 switch(A3)
		 {
		 case "1":
			 this.Milk();
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
	        	 this.Milk();
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
		 System.out.println("you selected Boost..................20 ₹");
		 Items[18]="boost";
		 rate[18]=20;
 		 System.out.println("how many cups you want ?");
 		 qunt[18]=sc.nextInt();
 		 bill[18]=qunt[18]*rate[18];
 		 System.out.println("===>your bill on Boost="+bill[18]+" ₹");
		 System.out.println("-----------------------------------");
		 System.out.println("If you want any other item? ");
		 System.out.println("In this Menu press 1");
		 System.out.println("Go to Main Menu press 2");
		 System.out.println("Go to total bill press 3");
		 System.out.println("Enter your choice ");
		 System.out.println("-----------------------------------");
		 String A4=sc.next();
		 switch(A4)
		 {
		 case "1":
			 this.Milk();
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
	        	 this.Milk();
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
		 System.out.println("you selected Rose Milk..............30 ₹");
		 Items[19]="Rose Milk";
		 rate[19]=30;
 		 System.out.println("how many cups you want ?");
 		 qunt[19]=sc.nextInt();
 		 bill[19]=qunt[19]*rate[19];
 		 System.out.println("===>your bill on Rose Milk="+bill[19]+" ₹");
		 System.out.println("---------------------------------------");
		 System.out.println("If you want any other item? ");
		 System.out.println("In this Menu press 1");
		 System.out.println("Go to Main Menu press 2");
		 System.out.println("Go to total bill press 3");
		 System.out.println("Enter your choice ");
		 System.out.println("---------------------------------------");
		 String A5=sc.next();
		 switch(A5)
		 {
		 case "1":
			 this.Milk();
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
	        	 this.Milk();
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
		 System.out.println("you selected Badam Milk.............30 ₹");
		 Items[20]="Badam Milk";
		 rate[20]=30;
 		 System.out.println("how many cups you want ?");
 		 qunt[20]=sc.nextInt();
 		 bill[20]=qunt[20]*rate[20];
 		 System.out.println("===>your bill on Badam Milk="+bill[20]+" ₹");
		 System.out.println("----------------------------------------");
		 System.out.println("If you want any other item? ");
		 System.out.println("In this Menu press 1");
		 System.out.println("Go to Main Menu press 2");
		 System.out.println("Go to total bill press 3");
		 System.out.println("Enter your choice ");
		 System.out.println("----------------------------------------");
		 String A6=sc.next();
		 switch(A6)
		 {
		 case "1":
			 this.Milk();
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
	         	 this.Milk();
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
		 System.out.println("Invalid entry (enter  Given item Number only)");
		 this.meth3();
		 break;
	 }
   }
}