
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jirapat = new Student("Jirapat Anantasiri", "1 Happy Ave");
		System.out.println(jirapat); //toString()
		
		//Test Setter&Getter
		jirapat.setAddress("25 Pattanakarn");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());
		
		//Test addCourseGrade(),printGrade(),and getAverageGrade()
		jirapat.addCourseGrade("INT107", 25);
		jirapat.addCourseGrade("INT108", 79);
		jirapat.addCourseGrade("MSC202", 69);
		jirapat.printGrade();
		
		System.out.printf("The average grade is %.2f%n",jirapat.getAverageGrade());
		
	}

}
