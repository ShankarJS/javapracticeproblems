package com.jip.lcwd.practicecbd;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 153;
		int temp = n;
		int r, sum = 0;
		
		while(n>0) {
			r = n%10;
			sum = sum+ r*r*r;
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
	}

}
