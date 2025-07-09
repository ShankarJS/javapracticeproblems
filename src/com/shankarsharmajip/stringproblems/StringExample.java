package com.shankarsharmajip.stringproblems;

//https://www.digitalocean.com/community/tutorials/java-string-quiz
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " GeeksforGeeks:A Computer Science  Portal  ";
		
		System.out.println("Original string: "+str);
		System.out.println("Length: "+str.length()); 		//10
		System.out.println("substring: "+str.substring(4));	//agoras
		System.out.println("substring again: "+str.substring(4, 7));	//ago
//		System.out.println(str.substring(4, 44)); //java.lang.StringIndexOutOfBoundsException: begin 4, end 11, length 10
//		System.out.println(str.substring(4, 3));  //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("after trim: "+str.trim());
		System.out.println("after intern: "+str.intern());
		System.out.println("after lowercase: "+str.toLowerCase());
		
		System.out.println("After split: ");
		String[] arrOfStr = str.split(":");
		for (String a : arrOfStr)
			System.out.println(a);
		
		
		System.out.println("-------Memory Heap-----------");
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		/*When we use double quotes to create a String, it first looks for String with the same value in the String pool. If found, then it returns the reference else it creates a new String in the pool and then returns the reference.
			However using new operator, we force String class to create a new String object in heap space. So s1 and s2 will have reference to the same String in the pool whereas s3 will be a different object outside the pool, hence the output.
		 */
		
		System.out.println("--- Switch example---");
		String switchstr = "Hello";
		switch(switchstr) {
			case "Hi":
				System.out.println("No");
				break;
			case "Hello":
				System.out.println("Yes");
				break;
			default:
				System.out.println("Kuch nahi");
		}
		
		System.out.println("---compareTo---");
		String s4 = "abc";
		String s5 = "def";
		System.out.println(s4.compareTo(s5));
		
		System.out.println("---Concat---");
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
		
		System.out.println("--- operator== -----------");
		String s6 = "abc";
		String s7 = "abc";
		System.out.println("s6 == s7 is:" + s6 == s7);	
		System.out.println("s6 == s7 is:" + (s6 == s7));
		
		
	}

}
