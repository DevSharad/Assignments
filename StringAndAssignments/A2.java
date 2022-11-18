
//remove vowels;
package StringAndAssignments;

public class A2 {

	public static void main(String[] args) {
		String abc="Sharad Yuvraj Patil";
	
		System.out.println(remVowel(abc));
	}
	static String remVowel(String abc){
			return abc.replaceAll("[aeiouAEIOU]","");
	}

	}


