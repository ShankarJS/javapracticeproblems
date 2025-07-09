package com.shankarsharmajip.collections;

//not proper, try again
public class ArrayListAddImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myadd = new ArrayList();
		myadd.add(1);
		myadd.add(2);
		myadd.add(3);
		myadd.add(4);
		myadd.add(5);
		
//		for(Integer i: myadd) {
//			System.out.println(i);
//		}
		System.out.println(myadd);
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Carol");

		System.out.println(names);
	}

}

class ArrayList<E>{
	private Object[] elements;
	private int size;
	
	public ArrayList() {
		elements = new Object[10];
		size = 0;
	}
	
	public void add(Object element) {
		if(size==elements.length) {
			Object[] newElements = new Object[elements.length*2];
			for(int i =0; i<size;i++) {
				newElements[i] = elements[i];
			}
		}
		elements[size++] = element;
	}
}
