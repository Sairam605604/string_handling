package string_handling;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "20";
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int sum = n1+n2;
		System.out.println(s2);
		System.out.println(sum);
		
		String s4 = String.valueOf(n1);
		String s5 = String.valueOf(n2);
		
		System.out.println(s4+s5);
		
		//String Methods
		
		String s = "Java";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		//System.out.println(s.charAt(4));

		System.out.println(s.length());
		
		int size = s.toUpperCase()
		.concat("22")
		.length();
		System.out.println(size);
		
		System.out.println("java".repeat(10));
		
		System.out.println("Java-22".substring(5));
		System.out.println("Java-22".substring(0,4));
		
		String email = "java@gmail.com";
		
		if(email.endsWith("@gmail.com")) {
			System.out.println("it is a gmail");
		}else {
			System.out.println("some other email id");
		}
		
		String[] courses = {"Angular","Java","JS","React"};
		for(String course : courses) {
			System.out.println(course);
			
		}
		System.out.println("".isBlank());
		System.out.println("".isEmpty());
		System.out.println("Java".isBlank());
		System.out.println("Java".isEmpty());
		
		
	}

}
