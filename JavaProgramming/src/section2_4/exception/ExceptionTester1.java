package section2_4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ExceptionTester1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0, result = 0;
		String answer = "SIM";
		do {
			try {
			System.out.println("Informe o numerador");
			num1 = sc.nextDouble();
			System.out.println("informe o denominador");
			num2 = sc.nextDouble();
			if(num2 == 0.0) {
				throw new Exception("Divisão por zero!");
			}
			} catch(InputMismatchException | NumberFormatException e) {
				System.out.println("Você precisa digitar um valor numérico: ");
				sc.nextLine();
				continue;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Não é possivel dividir por zero:");
				sc.nextLine();
				continue;
			} finally {
				num1 = 100;
				num2 = 10;
			}
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
