package string_handling;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		//mutable 
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		/*
//interview question[.equals is free object class method] [not overridden from string class method for content comparision]
//in StringBuffer .equals method is for reference comparison.
 *Advantages of StringBuffer :
 -> thread safety.[synchronization]
*Disadvantages of StringBuffer:
-> it is thread saftey 		 
		 */
	}

}
