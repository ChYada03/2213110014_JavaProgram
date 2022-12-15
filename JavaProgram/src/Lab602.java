import java.util.*;
public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static int sum= 0;
	static double average=0;
	public static void main(String[] args) {
		double[] inputscore = new double[5];
		for (int i = 0 ;i<inputscore.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			inputscore[i] = scan.nextDouble();
			sum += inputscore[i];
		}
		System.out.println();
		average = sum / (inputscore.length);
		System.out.println("Average of "+inputscore.length+
			" student is "+average);
		for (int i = 0 ;i<inputscore.length;i++) {
			if(inputscore[i]>average) {
				System.out.print("> Student"+(i+1)+" ("+inputscore[i]+")");
			}
		}
	}

}
