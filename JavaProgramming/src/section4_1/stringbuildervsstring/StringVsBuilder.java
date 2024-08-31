package section4_1.stringbuildervsstring;

public class StringVsBuilder {

	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder("Teste de Imutabilidade.");
		
		String str = "Teste de Imutabilidade.";
		
		System.out.println("Endereço da StringBuilder: " + sbr.hashCode());
		System.out.println("Endereço da String: " + str.hashCode());
		
		
		sbr.replace(0, sbr.length(), "Hello Word");
		str.replace("Teste", "Hello Word");
		
		System.out.println("Endereço da StringBuilder: " + sbr.hashCode());
		System.out.println("Endereço da String: " + str.hashCode());

	}

}
