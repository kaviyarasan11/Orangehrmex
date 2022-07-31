package javaoncept;

import java.util.LinkedList;

public class linkedlisteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("kavi");
		lst.add("kavi");
		lst.add("moon");
		lst.add("mom");
		lst.add("dad");
		System.out.println(lst);
		lst.addFirst("uncle");
		lst.addLast("anty");
		lst.add(4, "cusin");
		System.out.println(lst);
		System.out.println(lst.poll());
		System.err.println(lst.pollLast());
		System.out.println(lst.remove(4));
		System.err.println(lst.pollLast());
		
		

	}

}
