package section4_2.regularecpressionexemple;

import java.util.Scanner;

public class ReugularExpressionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resposta = "Não";
		if(getResposta(resposta)){
			System.out.println("Está é uma resposta válida.");
		}else {
			System.out.println("Está não é uma resposta válida.");
		}
		System.out.println("Digite uma palavra: ");
		String palavra = sc.nextLine();
		if(rhymingword(palavra)) {
			System.out.println(palavra + " rima com ar");
		}else {
			System.out.println(palavra + " não rima com ar");
		}
		
		System.out.print("Digite uma data: ");
		String data = sc.next();
		if(getData(data)) {
			System.out.println("Data: " + data + " está no padrão correto");
		}else {
			System.out.println("Data: " + data + " não está no padrão correto");
		}
		
		
		sc.close();
		
		

	}
	public static boolean getResposta(String resposta) {
		return resposta.matches("[Ss]im|[Nn]ão");		
	}
	
	public static boolean rhymingword(String palavra) {
		return palavra.matches("[A-z]*ar$");
	}
	public static boolean getData(String data) {
		return data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
	}

}
