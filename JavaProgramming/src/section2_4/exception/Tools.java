package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {
	Scanner scan = new Scanner(System.in);
	
	public static void divide(Scanner sc) throws Exception, InputMismatchException{
		double num1 = 0, num2 = 0, result = 0;
		String answer = "SIM";
		do {
			try (Scanner in = new Scanner(System.in)) {
			System.out.println("Informe o numerador");
			num1 = sc.nextDouble();
			System.out.println("informe o denominador");
			num2 = sc.nextDouble();
			if(num2 == 0.0) {
				throw new Exception("Divisão por zero!");
			}
			}
			 finally {}
			
			result = num1 / num2;

			System.out.println("O Resultado dessa divisão é " + result);

			System.out.println("Você deseja realizar uma nova divisão? (SIM/NÃO)");
			
			answer = sc.next();
			while(!answer.equalsIgnoreCase("SIM") && !answer.equalsIgnoreCase("Não")) {
				System.out.println("Você precisa digitar SIM ou Não");
				answer = sc.next();
			}
		} while (answer.equalsIgnoreCase("SIM"));
		System.out.println("Programa concluido");
		sc.close();
	
	}
	
}
