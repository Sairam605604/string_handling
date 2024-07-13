package string_handling;

public class StringDemo2 {
	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s);
//every time new object will be created but it is not an exsting object called anonymus object		
		String upperCase= s.toUpperCase();
		System.out.println(upperCase);
//String concept scp is used to make immutable.
		
//Immutable = non-changable,cannot be changes date any time.
		
//coverted but not exsting object,called anonymus object		
		String lowerCase= s.toLowerCase();
		System.out.println(lowerCase);
		
		System.out.println(s);
		/*
*why java people made string as immutable?
Answer:once change made on any instance of string object later 
		it will be updated it every instance of the program.
		*/		
	}

}
