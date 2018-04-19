package sample.code;

public class StringExample 
{
	public static void main(String args[]){
		String str1 = new String("First");
		System.out.println(str1);
		System.out.println(str1.concat(" Second"));
		System.out.println(str1);
		System.out.println(str1.substring(2));
		System.out.println(str1.charAt(4));
		System.out.println(str1.contains("F"));
		System.out.println(str1.length());
		char ch[] = {'t','e','s','t'};
		String str = new String();
		for (int i = str1.length() - 1; i >= 0; i--){
			str = str + str1.charAt(i);
		}
		System.out.println(str);
		int i = 10;
		float f= 10.12f;
		double d = 10.12;
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(f);
		String s3 = String.valueOf(d);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1+s2+s3);
	}

}
