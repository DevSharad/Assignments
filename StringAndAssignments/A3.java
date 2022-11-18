//WAP to print the all alphabets of string in descending order.
package StringAndAssignments;

import java.util.Arrays;

public class A3 {

	public static void main(String[] args) {
		
char c[]="zxjda".toCharArray();
descOrder(c);
System.out.println(String.valueOf(c));

	}
	static void descOrder(char[] c) {
		Arrays.sort(c);
		reverse(c);
	}
	private static void reverse(char[] a) {
		int i, n=a.length;
		char t;
		for(i=0; i<n/2;i++) {
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		
	}

}
