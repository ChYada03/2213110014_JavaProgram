import  java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static int[] numberOfInteger = {78, 36, 58, 41, 25, 92 ,75};
	public static void main(String[] args) {
		System.out.print("Input index of array : ");
		int indexOfarray = scan.nextInt();
		while(indexOfarray<0 || indexOfarray>(numberOfInteger.length -1)) {
			System.out.print("Input index of array, again : ");
			indexOfarray = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+(numberOfInteger[indexOfarray]));
		//System.out.println("Value in next index is "+(numberOfInteger[indexOfarray+1]));
		if (indexOfarray==(numberOfInteger.length-1)) {
			System.out.println("Sorry, "+indexOfarray+" is the last index in array.");
		}else {
			System.out.println("Value in next index is "+(numberOfInteger[indexOfarray+1]));
		}
		
	}

}
