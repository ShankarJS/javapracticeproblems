package com.jip.lcwd.practicecbd;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int count = 0;
		
		if(num>1) {
			
			for(int i =1; i<=num; i++) {
				if(num%i == 0) count++;
			}
			
			if(count > 2) {
				System.out.println("Number is not prime");
			} else {
				System.out.println("Number is prime");
			}
		} else {
			System.out.println("Number is not prime");
		}
		

	}

}
