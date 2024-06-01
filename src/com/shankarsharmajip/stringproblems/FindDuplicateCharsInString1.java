package com.shankarsharmajip.stringproblems;

public class FindDuplicateCharsInString1 {

	public static void main(String[] args) {
		
		String input = "shankarlal sharma";
		int count, i, j;
		char[] tempChars = input.toCharArray();
		
		System.out.println("Duplicate chars are: ");
		for(i=0; i< tempChars.length; i++) {
			count = 1;
			for(j=i+1;j<tempChars.length; j++) {
				if(tempChars[i]==tempChars[j] && tempChars[i]!=' ') {
					count++;
					tempChars[j]='0';
				}
			}
			if(count>1 && tempChars[i]!='0') {
				System.out.println(tempChars[i]);
			}
		}

	}

}
