import java.util.*;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		int sizepd = scan.nextInt();
		Product[] pd = new Product[sizepd];
		System.out.println();
		for (int i = 0; i < pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(scan.nextInt());
			while (pd[i].getUnit() <= 0) {
				System.out.print("Input product Unit ,again : ");
				pd[i].setUnit(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("------------------------------------------");
		for (Product _pd : pd) {
			if (_pd.checkproduct(_pd.getUnit()).equalsIgnoreCase("LOW"))
				System.out.println(">> " + _pd.getID() + " has " + _pd.getUnit() + " units");
		}
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("------------------------------------------");
		for (Product _pd : pd) {
			if (_pd.checkproduct(_pd.getUnit()).equalsIgnoreCase("NORMAL"))
				System.out.println(">> " + _pd.getID() + " has " + _pd.getUnit() + " units");
		}
		System.out.println("------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("------------------------------------------");
		for (Product _pd : pd) {
			if (_pd.checkproduct(_pd.getUnit()).equalsIgnoreCase("HIGH"))
				System.out.println(">> " + _pd.getID() + " has " + _pd.getUnit() + " units");
		}
	}// end of main

}
