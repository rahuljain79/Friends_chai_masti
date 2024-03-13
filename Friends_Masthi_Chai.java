package p1;

public class Friends_Masthi_Chai extends chai {
	public void Main_menu() {
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("⭆⭆⭆Main menu⭅⭅⭅");
		System.out.println("---------------------------");
		System.out.println("Please Choose Your  Order");
		System.out.println("1.Chai(Tea)");
		System.out.println("2.Coffee");
		System.out.println("3.Milk");
		System.out.println("4.Lassi");
		System.out.println("5.Ice Creams");
		System.out.println("6.Snacks");
		System.out.println("please enter item number");
		System.out.println("-------------------------");
		this.meth();
	}

	void meth() {
		String a = sc.next();
		switch (a) {
			case "1":
				super.Chai();
				break;
			case "2":
				super.Coffee();
				break;
			case "3":
				this.Milk();
				break;
			case "4":
				super.Lassi();
				break;
			case "5":
				super.Ice_Creams();
				break;
			case "6":
				super.Snacks();
				break;
			default:
				System.out.println("Invalid entry (enter  Given item Number only)");
				this.meth();
				break;
		}
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("======>>>>☕☕WELOCME TO FRIENDS  MASTI CHAI☕☕<<<<======");
		System.out.println("          ---------------------------------------             ");
		new Friends_Masthi_Chai().Main_menu();
		Bill_interface aobj = new Friends_Masthi_Chai();
		aobj.Bill();
		System.out.println("   ☻☻ thank you for your order ☻☻     ");
		System.out.println("   ---------------------------------  ");
		System.out.println("   ☕☕☕===>>Visit again<<===☕☕☕  ");
		System.out.println("   --------------*------------------  ");

	}
}