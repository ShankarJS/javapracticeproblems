package com.kunalkushwaha.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		
		try {
//			divide(a, b);
//			throw new Exception();
			
			String name = "Kunal";
			if(name.equals("Kunal")) {
				throw new MyException("name is Kunal");
			}
		} catch(MyException e) {
			System.out.println(e);
		}  catch(ArithmeticException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Normal exception: "+ e);
		} finally {
			System.out.println("This will always execute");
		}
		
	}
	
	static int divide(int a, int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("Please do not divide by zero");
		}
		
		return a/b;
	}

}
