package p1;

public class ice_creams extends snacks
{
	void Ice_Creams()
	 {
  	 System.out.println("--->ICE CREAMS<---");
  	 System.out.println("-------------------------------------");
  	 System.out.println("1.Vanilla(250ml).............80 ₹");
  	 System.out.println("2.Strawberry(250ml)..........80 ₹");
  	 System.out.println("3.Chocolate(250ml)...........115 ₹");
  	 System.out.println("4.Butter Scotch(250ml).......115 ₹");
  	 System.out.println("--------------------------------------");
	 System.out.println("5.Main Menu");
  	 System.out.println("please enter Given item Number only");
  	 System.out.println("--------------------------------------");
  	 this.meth5();
     }
	 void meth5()
	 {
	 String i=sc.next();
  	 switch(i)
		 {
		 case "1":
  		 System.out.println("you selected Vanilla(250ml).............80 ₹");
  		 Items[26]="Vanilla(250ml)ice-creams";
  		 rate[26]=80;
		 System.out.println("how many cups you want ?");
		 qunt[26]=sc.nextInt();
		 bill[26]=qunt[26]*rate[26];
		 System.out.println("===>your bill on Vanilla ice-creams="+bill[26]+" ₹");
		 System.out.println("------------------------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("Enter your choice ");
  		 System.out.println("------------------------------------------------");
  		 String A1=sc.next();
  		 switch(A1)
  		 {
  		 case "1":
  			 this.Ice_Creams();
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
  	         		this.Ice_Creams();
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
  		 System.out.println("you selected Strawberry(250ml)..........80 ₹");
  		 Items[27]="Strawberry(250ml)ice-creams";
  		 rate[27]=80;
		 System.out.println("how many cups you want ?");
		 qunt[27]=sc.nextInt();
		 bill[27]=qunt[27]*rate[27];
		 System.out.println("===>your bill on Strawberry ice-cream="+bill[27]+" ₹");
		 System.out.println("--------------------------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("Enter your choice ");
  		 System.out.println("---------------------------------------------------");
  		 String A2=sc.next();
  		 switch(A2)
  		 {
  		 case "1":
  			 this.Ice_Creams();
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
  	        	 this.Ice_Creams();
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
  		 System.out.println("you selected Chocolate(250ml)...........115 ₹");
  		 Items[28]="Chocolate(250ml)ice-creams";
  		 rate[28]=115;
		 System.out.println("how many cups you want ?");
		 qunt[28]=sc.nextInt();
		 bill[28]=qunt[28]*rate[28];
		 System.out.println("===>your bill on Chocolate ice-creams="+bill[28]+" ₹");
		 System.out.println("--------------------------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("Enter your choice ");
  		 System.out.println("---------------------------------------------------");
  		 String A3=sc.next();
  		 switch(A3)
  		 {
  		 case "1":
  			 this.Ice_Creams();
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
  	        	 this.Ice_Creams();
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
  		 System.out.println("you selected Butter Scotch(250ml).......115 ₹");
  		 Items[29]="Butter Scotch(250ml)ice-creams";
  		 rate[29]=115;
		 System.out.println("how many cups you want ?");
		 qunt[29]=sc.nextInt();
		 bill[29]=qunt[29]*rate[29];
		 System.out.println("===>your bill on Butter Scotch ice-creams="+bill[29]+" ₹");
		 System.out.println("------------------------------------------------------");
  		 System.out.println("If you want any other item? ");
  		 System.out.println("In this Menu press 1");
  		 System.out.println("Go to Main Menu press 2");
  		 System.out.println("Go to total bill press 3");
  		 System.out.println("------------------------------------------------------");
  		 System.out.println("Enter your choice ");
  		 System.out.println("--------------------------------------------------------");
  		 String A4=sc.next();
  		 switch(A4)
  		 {
  		 case "1":
  			 this.Ice_Creams();
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
  	        	 this.Ice_Creams();
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
  		  new Friends_Masthi_Chai().Main_menu();
	      break;
  	  default:
  		 System.out.println("Invalid entry (enter  Given item Number only)");
  		 this.meth5();
  		 break;
		 }
	 }
}