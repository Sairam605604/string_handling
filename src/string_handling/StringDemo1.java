package string_handling;

public class StringDemo1 {
	public static void main(String[] args) {
		//String Object using Literal
		String s1 = "Java";
				
		//String object using new operator
		String s2 = new String("Python");
		
		String s3 = "Java";
		String s4 = new String("Python");
		
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s4));
		
		char[] chars = {'s','a','i'};
		
		String s5 = new String(chars);
		System.out.println(s5);
		
		byte[] bytes = {65,66,67};
		String s6 = new String(bytes);
		System.out.println(s6);
		
		/*
		 String is immutable,
		 String class.equals() performs content comparison.
		 */
		String lines = """
		String is immutable,
		String class .equlas() performs content comparison.
		""";
		System.out.println(lines);
		
		/*"Love All Serve All" */
		
		String quote = "\"Love All Serve All\"";
		System.out.println(quote);
		
		String quote2 = "/*\"Love All Serve All\"*/";
		System.out.println(quote2);
		
				
	}

}
