package auxiliary;

import main.AbstractClass;
import main.ConcreteClass;
import main.ConcreteClass1;
import main.ConcreteClass2;
import main.Tools;

public class AuxiliaryTester {

	public static void main(String[] args) {
		ConcreteClass1 cc1 = new ConcreteClass1();
		ConcreteClass2 cc2 = new ConcreteClass2();

		cc1.setPassword(5555);
		cc2.setPassword(6666);

		System.out.println(cc1.getPassword());
		System.out.println(cc2.getPassword());

		System.out.println("Fim do roteiro 1");
		System.out.println("------------");

		System.out.println("Inicio Roteiro 2");

		AbstractClass ac1 = new ConcreteClass();
		ConcreteClass cc3 = new ConcreteClass();

		ac1.sayHello();
		cc3.sayHello();

		System.out.println("Fim do roteiro2");
		System.out.println("--------------");

		System.out.println("Inicio do Roteiro 4");

		System.out.println(ac1.INTERFACEVAR);
		System.out.println(cc3.INTERFACEVAR);

		AuxiliaryClass aux = new AuxiliaryClass();
		// aux.INTERFACEVAR = false; essa linha não funciona por ser uma constante
		System.out.println(aux.INTERFACEVAR);
		aux.interfaceMethod1();

		System.out.println("Fim do roteiro 4.");
		System.out.println("----------------------------------");

		System.out.println("Inicio do roteiro 6.");

		/*
		 * Tools t01 = new Tools(); Tools t02 = new Tools();
		 * 
		 * t01.option = 'B'; t02.option = 'C';
		 * 
		 * System.out.println(t01.option); System.out.println(t02.option);
		 * 
		
		Tools.option = 'D';
		Tools.printOption();
 */
		
		Tools.display("Vai corinthians!");
		Tools.display(23.22);
		Tools.display(34.22f);
		
		 
		double res = Tools.sum(33, 15.55);
		System.out.println(100 + res);
		
		System.out.println("Fim do roteiro 6.");
		System.out.println("----------------------------------");

		System.out.println("Inicio do roteiro 7.");
		
		//ConcreteClass2 cc4 = new ConcretClass2(7890);
		ConcreteClass cc5 =  new ConcreteClass(7890);
		AbstractClass cc6 = new ConcreteClass(7890);
	}

}
