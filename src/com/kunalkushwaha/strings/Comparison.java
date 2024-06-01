package com.kunalkushwaha.strings;

public class Comparison {
	public static void main(String[] args) {
		String a = "Kunal";
		String b = "Kunal";
		String c = a;
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c==a);
		
		String name1 = new String("Kunal");
		String name2 = new String("Kunal");
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		System.out.println(name1.charAt(0));
	}
}
