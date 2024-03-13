package p1;

public class lassi extends ice_creams
{
	void Lassi() 
	 {
		System.out.println("--->LASSI<---");
  	    System.out.println("-------------------------------------");
	    System.out.println("1.Lassi..................40 ₹");
	    System.out.println("2.Banana Lassi...........40 ₹");
	    System.out.println("3.Rose lassi.............40 ₹");
	    System.out.println("4.Mango Lassi............40 ₹");
	    System.out.println("5.Strawberry Lassi.......80 ₹");
	    System.out.println("--------------------------------------");
	   	System.out.println("6.Main Menu");
	    System.out.println("please enter Given item Number only");
	    System.out.println("---------------------------------------");
	    this.meth4();
	  }
	 void meth4() 
	 {
		 String L=sc.next();
	     switch(L)
		 {
		 case "1":
  		 System.out.println("you selected Lassi..................40 ₹");
  		 Items[21]="Lassi";
  		 rate[21]=40;
		 System.out.println("how many Glass you want ?");
		 qunt[21]=sc.nextInt();
		 bill[21]=qunt[21]*rate[21];
		 System.out.println("===>your bill on Lassi="+bill[21]+" ₹");
  		 System.out.println("----------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("Enter your choice ");
  		 System.out.println("-----------------------------------");
  		 String A1=sc.next();
  		 switch(A1)
  		 {
  		 case "1":
  			 this.Lassi();
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
  	        	 this.Lassi();
  	             break;
  	         case "2":
  	        	 new Friends_Masthi_Chai().Main_menu();
  	             break;
  	         case "3":
  	        	 Bill();
  	             break;
  	         default:
  	        	 System.out.println("Invalid entry (enter  Given item Number only)");
  	             break;
  	            }
  		 }
  		 break;
  	 case "2":
  		 System.out.println("you selected Banana Lassi...........40 ₹");
  		 Items[22]="Banana Lassi";
  		 rate[22]=40;
		 System.out.println("how many Glass you want ?");
		 qunt[22]=sc.nextInt();
		 bill[22]=qunt[22]*rate[22];
		 System.out.println("===>your bill on Banana Lassi="+bill[22]+" ₹");
 		 System.out.println("-----------------------------------------");
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
  			 this.Lassi();
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
  	        	 this.Lassi();
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
  		 System.out.println("you selected Rose lassi.............40 ₹");
  		 Items[23]="Rose Lassi";
  		 rate[23]=40;
		 System.out.println("how many Glass you want ?");
		 qunt[23]=sc.nextInt();
		 bill[23]=qunt[23]*rate[23];
		 System.out.println("===>your bill on Rose lassi="+bill[23]+" ₹");
 		 System.out.println("---------------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("Enter your choice ");
  		 System.out.println("---------------------------------------");
  		 String A3=sc.next();
  		 switch(A3)
  		 {
  		 case "1":
  			 this.Lassi();
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
  	        	 this.Lassi();
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
  		 System.out.println("you selected Mango Lassi............40 ₹");
  		 Items[24]="Mango Lassi";
  		 rate[24]=40;
		 System.out.println("how many Glass you want ?");
		 qunt[24]=sc.nextInt();
		 bill[24]=qunt[24]*rate[24];
		 System.out.println("===>your bill on Mango Lassi="+bill[24]+" ₹");
 		 System.out.println("----------------------------------------");
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
  			 this.Lassi();
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
  	        	 this.Lassi();
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
  		 System.out.println("you selected Strawberry Lassi.......80 ₹");
  		 Items[25]="Strawberry Lassi";
  		 rate[25]=80;
		 System.out.println("how many Glass you want ?");
		 qunt[25]=sc.nextInt();
		 bill[25]=qunt[25]*rate[25];
		 System.out.println("===>your bill on Strawberry Lassi="+bill[25]+" ₹");
		 System.out.println("----------------------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("Enter your choice ");
  		 System.out.println("---------------------------");
  		 String A5=sc.next();
  		 switch(A5)
  		 {
  		 case "1":
  			 this.Lassi();
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
  	        	 this.Lassi();
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
  		 new Friends_Masthi_Chai().Main_menu();
	     break;
  	 default:
  		 System.out.println("Please give correct entry (enter  Given item Number only)");
  		 this.meth4();
  		 break;
		 }
	 }
}