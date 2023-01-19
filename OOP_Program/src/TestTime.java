
public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time(1,2,3);
		System.out.println(t1);
		Time t2 = new Time();
		System.out.println(t2);
		
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		
		System.out.println("\n"+t1);
		System.out.println("Hour is"+t1.getHour());
		System.out.println("Minute"+t1.getMinute());
		System.out.println("Second is"+t1.getSecond());
		
		t1.setTime(58, 59, 23);
		System.out.println("\n"+t1); //23 59 58
		
		System.out.println(t1.nextSecond());
		//23:59:59
		System.out.println(t1.nextSecond().nextSecond().nextSecond());
		//00:00:02
	}
}
