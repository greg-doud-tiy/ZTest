import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> someStrings = new ArrayList<String>();
		someStrings.add("FooBar");
		someStrings.add("Joe");
		someStrings.add("I'm done");
		
		for(String str : someStrings) {
			System.out.println("The string is " + str);
		}
		
		String foobar = someStrings.get(0);
		System.out.println(foobar);
		
		someStrings.sort(c);
		

	}

}
