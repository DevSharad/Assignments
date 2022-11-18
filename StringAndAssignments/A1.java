
//WAP to print the all alphabets of String in ascending order.


package StringAndAssignments;
import java.util.Arrays;
public class A1 {

	public static void main(String[] args) {
		String str="dbc"
				+ "a";
		sortString(str);
		
	}

	static void sortString(String str) {
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		System.out.println(String.valueOf(arr));
		
	}
}
