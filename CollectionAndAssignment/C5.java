//WAP to store data related to item in Vector and after that sort the data.
package CollectionAndAssignment;
import java.util.Collections;
import java.util.Vector;

public class C5 {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("akash");
		vector.add("sham");
		vector.add("ram");
		vector.add("ganesh");
		vector.add("ram");
		
		Collections.sort(vector);
		System.out.println(vector);
	}
}
