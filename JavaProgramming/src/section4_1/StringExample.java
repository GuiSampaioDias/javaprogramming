package section4_1;

import java.util.ArrayList;

public class StringExample {

	public static void main(String[] args) {
		String str = "Um texto qualquer";
		String str8 = "Esse maluco gosta de falar abobrinha, o Itau está fazendo mal para ele.";
		String str1 = str.replace(" ", "");
		System.out.println(str1);
		
		parseString(str);
		
		String[] lista = str8.split(" ");
		
		for(String arrTemp : lista) {
			System.out.println(arrTemp);
		}
		
		
		/*
		String str1 = str.substring(0, 2); 
		String str2 = str.substring(3, 8); 
		String str3 = str.substring(9); 
		System.out.printf("%s %s %s%n", str1, str2, str3);
		
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(str1);
		lista.add(str2);
		lista.add(str3);
		
		System.out.println("###################");
		for(int i = 0; i <lista.size(); i ++) {
			System.out.print(lista.get(i) + " ");
		}
		
		String str5 = "dois textos qualquer";		
		
		for(int i = 0 ; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		for(char letra : str.toCharArray()) {
			System.out.println(letra);
		}
		System.out.println();
		
		for(int i = str5.length() -1; i >= 0; i -- ) {
			System.out.print(str5.charAt(i));
		}
			
		searchChar(str,'e');
		*/
	}
	
	public static void searchChar(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length() -1; i++) {
			if(str.charAt(i) == c) {
				count ++;
			}
		}
		System.out.printf("%ntemos %d %c na frase.%n", count, c);
	}
	public static void parseString(String str) {
		ArrayList<String> list = new ArrayList<>();
		while(str.length() > 0) {
			int index = str.indexOf(" ");
			if(index == -1) {
				break;
			}
			list.add(str.substring(0, index));
			str = str.substring(index + 1);
		}
		list.add(str);
		 
		for (String arrTemp: list) {
			System.out.println(arrTemp);
		}
		
	}

}
