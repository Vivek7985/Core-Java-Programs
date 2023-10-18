package Stringmethods;

public class A {

	public static void main(String[] args) {
	
		String s="Vivek Sale";
		String s1="VIVEK SALE";

		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.substring(4));
		System.out.println(s.substring(1,7));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.concat(s1));
		System.out.println(s.concat(" "+s1));
		System.out.println(s.indexOf("e"));
		System.out.println(s.trim());
		System.out.println(s.startsWith("i"));
		System.out.println(s.startsWith("Viv"));
		System.out.println(s.endsWith("e"));
		System.out.println(s.endsWith("le"));
	}

}
