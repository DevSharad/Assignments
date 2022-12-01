package StreamApiLambda;

import java.util.function.Predicate;

public class S2 {
	public static void main(String[] args) {
		Predicate<String> predicate=str->str.contains("AST");
		if(predicate.test("Taj is situated in Agra AST"))
		{
			System.out.println("String Found...");
		}
		else
		{
			System.out.println("String not Found...");
		}
	}
}
