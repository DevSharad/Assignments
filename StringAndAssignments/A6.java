//count of odd and even numbers.

package StringAndAssignments;

public class A6 {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8};
		int n=arr.length;
		CountingEvenOdd(arr, n);
	}
	static void CountingEvenOdd(int arr[], int arr_size) {
		int even_count=0;
		int odd_count=0;
		for(int i=0; i<arr_size;i++) {
			if((arr[i]%2)==1)
				odd_count++;
		}
		System.out.println("number of even elements="+even_count+"  number of odd elements="+odd_count);
		
	}

}
