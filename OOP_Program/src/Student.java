
public class Student {
	//private instance variables
	private String name;
	private String address;
	//courses and grade kept 2 parallel arrays
	private String[] courses;
	private int[] grades; //[0,100]
	private int numCourses;
	private static final int MAX_COURSE = 30 ;
	
	//CONSTRUCTOR
	public Student (String name,String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0 ;
	}
	//setter&getter method(dont have setter for name)
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return getName()+ " ("+getAddress()+")";
	}
	
	/**Add courses and grades**/
	public void addCourseGrade(String course,int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	/**Prints all courses & grades*/
	public void printGrade() {
		System.out.print(name);
		for(int i = 0;i<numCourses;i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);	
		}
		System.out.println();
	}
	
	/**Computes the average grade*/
	public double getAverageGrade() {
		int sum = 0;
		for(int i = 0;i<numCourses;i++) {
			sum+=grades[i];
		}
		return (double)sum/numCourses;
	}
	
}
