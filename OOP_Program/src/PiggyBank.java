
public class PiggyBank {
	// Attributes
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;

	// Methods
	public void setPiggyBank(int s) {
		Clear();
		size = s;
	}// end setPiggyBank

	public int getPiggyBank() {
		return size;
	}
	public void Clear() {
		one = two = five = ten = 0;
	}// end Clear

	public int getTotal() {
		return one + (two * 2) + (five * 5) + (ten * 10);
	}// end getTotal

	public void addOne(int c) {
		if (getTotal() + c <= size) {
			one += c;
		} else
			System.err.println("Piggy Bank Full");
	}// end addOne

	public void addTwo(int c) {
		if (getTotal() + (c*2) <= size) {
			two += c;
		} else
			System.err.println("Piggy Bank Full");
	}// end addTwo

	public void addFive(int c) {
		if (getTotal() + (c*5) <= size) {
			five += c;
		} else
			System.err.println("Piggy Bank Full");
	}// end addFive

	public void addTen(int c) {
		if (getTotal() + (c*10) <= size) {
			ten += c;
		} else
			System.err.println("Piggy Bank Full");
	}// end addTen
}
