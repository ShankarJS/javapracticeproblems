package com.whiteboard;

public class TodoDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, -2, 2};
		int sum=2;
		
		for(int i = 0; i<= arr.length; i++) {
			if(arr[i]+arr[i+1]+arr[i+2]<=sum) {
				System.out.println(arr[i]+","+arr[i+1]+","+arr[i+2]);
			}
			
			
			
			
		}

	}

}
