package esercizio2;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int km, liters, distance;
		
		try {
			System.out.println("Km done so far");
			km = scan.nextInt();
			
			System.out.println("Liters of fuel deplited");
			liters = scan.nextInt();
			
			distance = km / liters;
			
			System.out.println("Your car has done a total of " + distance + "km per liters");
			
		}catch(ArithmeticException ex) {
			
			System.out.println("Every car consumes fuel" + ex.getMessage());
			
			ex.printStackTrace();
			
		}catch(Exception ex) {
			
			System.out.println("This is another mistake..." + ex.getMessage());
			ex.printStackTrace();
			
		}
		
		System.out.println("End");
		
	}

}
