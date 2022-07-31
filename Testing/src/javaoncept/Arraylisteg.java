package javaoncept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylisteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> data=new ArrayList<String>();
		data.add("kavi");
		data.add("moon");
		data.add("kavi");
		data.add("moon");
		data.add("mom");
		System.out.println(data);
		data.add(null);
		
		data.add(null);
		System.out.println(data);
		
		System.out.println(data.get(0));
		System.out.println(data.indexOf("kavi"));
		List<String> newdata =new ArrayList<String>();
		newdata.addAll(data);
		System.out.println(data.containsAll(newdata));
		System.out.println(data.contains("moon"));
		//data.clear();
		System.out.println(data);
		System.out.println(data.isEmpty());
		System.out.println(data.remove(4));
		System.out.println(data);
		
		System.out.println(data.indexOf("mom"));
		System.out.println(data.set(0, "dad"));
		
		System.out.println(data);
		
		for (String string : newdata) {
			System.out.println(string);
		}
		System.out.println("List iterator");
		ListIterator<String> listit=data.listIterator();
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		System.out.println("backward");
		while(listit.hasPrevious())
		{
			System.out.println(listit.previous());
		}
		Iterator<String> it=data.iterator();
		System.out.println("simple iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("for loop1e");
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}

	}

}
