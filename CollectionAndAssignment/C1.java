// WAP to sort Collection elements in ascending order.
package CollectionAndAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(5);
		Collections.sort(list);
		System.out.println(list);
	}
}

