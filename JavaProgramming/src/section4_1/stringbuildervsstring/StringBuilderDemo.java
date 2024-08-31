package section4_1.stringbuildervsstring;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder("Aprendendo Java com a Oracle");
		
		System.out.println(sbr);
		System.out.println(sbr.reverse());
		System.out.println(sbr);
		System.out.println(sbr.reverse());
		
		sbr.append(" é legal." );
		System.out.println(sbr);
		
		sbr.delete(11,16);
		System.out.println(sbr);
		
		sbr.insert(11, "Java Programing ");
		
		System.out.println(sbr);

		System.out.println(sbr.indexOf(" ", 11));
		
		
		String str = "10";
		System.out.println(str + 3);
		int str1 = Integer.parseInt(str);
		System.out.println(str1 + 3);
		
		StringBuilder str2 = new StringBuilder("10");
		int str3 = Integer.parseInt(str2.toString());
		System.out.println(str3 + 3);
	}

}
