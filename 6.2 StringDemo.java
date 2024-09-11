public class StringDemo
{
	public static void main(String args[])
	{
		String name = "Jonathan";

		System.out.println("name: " + name);
		System.out.println("3rd character of name: " + name.charAt(2));
		/* character that first appears alphabetically has lower unicode value */
		System.out.println("Jonathan compared to Solomon: " + name.compareTo("Solomon"));
		System.out.println("Solomon compared to Jonathan: " + "Solomon".compareTo("Jonathan"));
		/* 'J' has lower unicode value compared to 'j' */
		System.out.println("Jonathan compared to jonathan: " + name.compareTo("jonathan"));
		System.out.println("Jonathan compared to jonathan(ignore case): " + name.compareToIgnoreCase("jonathan"));
		System.out.println("Is Jonathan equal to Jonathan? " + name.equals("Jonathan"));
		System.out.println("Is Jonathan equal to jonathan? " + name.equals("jonathan"));
		System.out.println("Is Jonathan equal to jonathan(ignore case)? " + name.equalsIgnoreCase("jonathan"));

		char charArr[] = "Hi XX".toCharArray();
		/* Need to add 1 to the endSrc index of getChars */
		"Jonathan".getChars(0, 2, charArr, 3);
		System.out.print("getChars method: ");
		System.out.println(charArr);
		System.out.println("Length of name: " + name.length());
		System.out.println("Replace a's with e's in name: " + name.replace('a', 'e'));
		/* Need to add 1 to the endIndex parameter of substring*/
		System.out.println("A substring of name: " + name.substring(0, 2));

		System.out.println("Trim \" a b c d e f \": \"" + " a b c d e f ".trim() + "\"");
		System.out.println("String representation of boolean expression 10>10: " + String.valueOf(10>10));
		/* toString method is implicitly called in the println method*/
		System.out.println("String representation of boolean expression 10<10: " + (10<10));
		/* Note there's no change in the String object name even after applying all these methods. */
		System.out.println("name: " + name);
	}
}