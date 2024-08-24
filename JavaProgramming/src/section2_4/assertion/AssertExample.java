package section2_4.assertion;

import java.util.Locale;
import java.util.Scanner;

public class AssertExample {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.err.println("Por favor, digite um número:");
		double num = sc.nextDouble();
		System.out.println("O número digitado é :" + num);
		sc.close();
		
		assert num <= 2147483647 : "Valor superior ao da capacidade do tipo primitivo int";
		
		int y = (int) num;
		System.out.println("O número formado para inteiro é : " + y);
		
	}
	

}
