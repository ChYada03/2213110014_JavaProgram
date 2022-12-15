import javax.swing.JOptionPane;

public class Lab606 {
	static boolean check = false;
	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int indexOfarray  = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Input index of array:"));
		checkIndex(nums,indexOfarray);
		boolean check = checkIndex(nums, indexOfarray);
		while (!checkIndex(nums, indexOfarray)) {
			indexOfarray  = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "Input index of array,again:"));
		}
		JOptionPane.showMessageDialog(null, "Current data, nums["+indexOfarray+"] is "+currentData(nums,indexOfarray)+
				(indexOfarray !=0 ? "\nPrevious data, nums["+(indexOfarray-1)+"] is "+prevData(nums,indexOfarray) :"\nNo previous data")+ 
				(indexOfarray != nums.length-1 ? "\nNext data, nums["+(indexOfarray+1)+"] is "+nextData(nums,indexOfarray) :"\nNo next data"));
	}
	public static boolean checkIndex(int[] nums,int index) {
		return (index >= 0 && index < nums.length ? true : false) ;
	}
	public static int currentData(int[] nums,int index) {

		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		
		return nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		
		return nums[index+1];
	}

	

}
