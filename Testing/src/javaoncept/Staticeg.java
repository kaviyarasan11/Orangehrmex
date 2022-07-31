package javaoncept;

public class Staticeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= " kaviyarasn ";
		//name ="mohanakavi";
		System.out.println(""+name);
		
		System.out.println(name.length());
		System.out.println(name.concat("kavi"));
		
		System.out.println(name.contains("kavi"));
		
		System.out.println(name.equals("kavi"));
		
		System.out.println(name.indexOf('k'));
		System.out.println(name.indexOf('a', 2));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.isEmpty());
		System.out.println(name.replace("kavi", "ravi"));
		System.out.println(name.trim());
		System.out.println(name.startsWith(" kavi"));
		System.out.println(name.charAt(5));
		System.out.println(name.substring(1));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		//System.out.println(name.valueOf('y'));
		
		name="kavi,yarasan,d"
	;
		String[] str=name.split(",");
		for (String string : str) {
			System.out.println(string);
			
		}
	//	System.out.println(name.valueOf(5));
		System.out.println(name.join("/", "kavi","moon","van"));
		//System.out.println(name.to);
		
		
		
		
		
		
		
		
		
		

	}

}
