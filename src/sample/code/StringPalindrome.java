package sample.code;

public class StringPalindrome {
	public static void main(String args[]){
		String org = "MADAM";
		int org_len = org.length();
		System.out.println("org length: " + org_len);
		String rev = new String();
		System.out.println("rev :" + rev);
		for (int i = org.length() - 1; i >= 0; i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println("rev: " + rev);
		if (org.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
