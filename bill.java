package p1;

import java.time.LocalDate;
import java.time.LocalTime;

public class bill implements Bill_interface {

	static float bill[] = new float[34];
	static String Items[] = new String[34];
	static int qunt[] = new int[34];
	static float rate[] = new float[34];

	@Override
	public void Bill() {

		System.out.println("                                                           Date:" + LocalDate.now());
		System.out.println("                                                           Time:" + LocalTime.now());
		System.out.println();
		System.out.println(
				"S.No" + "   " + "   Item Name         " + " Quantity " + "    " + " rate " + "  " + "    bill ");
		System.out.println("-----   --------------       --------      ----       ----- ");
		float Total_Bill = 0;
		int Sno = 1;
		int k = 0;
		for (float a : bill) {
			if (a > 0) {
				System.out.println("  " + Sno + "   " + Items[k] + "   " + qunt[k] + "  " + rate[k] + "  " + a);
				Total_Bill = Total_Bill + a;
				Sno++;
			}
			k++;
		}

		/*
		 * for( int a=0;a<=33;a++)
		 * {
		 * if(qunt[k]>0)
		 * {
		 * System.out.println("  "+Sno+"      "+Items[k]+"              "+qunt[k]
		 * +"          "+rate[k]+"         "+bill[k]);
		 * Total_Bill=Total_Bill+bill[k];
		 * Sno++;
		 * }
		 * k++;
		 * 
		 * }
		 */

		System.out.println();
		System.out.println("                               =========================================");
		System.out.println("                                    your Total Bill is =" + Total_Bill + " ₹");
		System.out.println("                               =========================================");
		System.out.println();
		System.out.println();
		System.out.println("please take your order and pay money at bill counter");
		System.out.println();

	}
}
