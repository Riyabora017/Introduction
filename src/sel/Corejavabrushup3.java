package sel;

public class Corejavabrushup3 {

	public static void main(String[] args) {

		// string is an object //String literal

		// String s1 = "buddy what happend";

		String s5 = "hello";

		// new
		String s2 = new String("Welcome");

		String s3 = new String("Welcome");

		String s = "buddy what happend";

		String[] splittedString = s.split("what");

		System.out.println(splittedString[0]);

		System.out.println(splittedString[1]);

		System.out.println(splittedString[1].trim());

		for (int i = s.length() - 1; i >= 0; i--)

		{
			System.out.println(s.charAt(i));
		}

	}

}
