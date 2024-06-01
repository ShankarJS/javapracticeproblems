package com.kunalkushwaha.strings;

/*Format Specifiers
Let’s look at the available format specifiers available for printf:

%c character
%d decimal (integer) number (base 10)
%e exponential floating-point number
%f floating-point number
%i integer (base 10)
%o octal number (base 8)
%s String
%u unsigned decimal (integer) number
%x number in hexadecimal (base 16)
%t formats date/time
%% print a percent sign
\% print a percent sign
Note: %n or \n are used as line separators in printf().*/

public class PrettyPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 453.1274f;
		System.out.printf("Formatted number is %.2f", a); //It will round off as well
		System.out.println();
		System.out.printf("Pie: %.3f", Math.PI);
		System.out.println();
		System.out.printf("Hello my name is %s and I am %s", "Kunal", "Cool");
		
	}

}
