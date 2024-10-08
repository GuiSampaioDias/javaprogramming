package auxiliary;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.AbstractClass;
import main.Annotation1;
import main.Annotation2;
import main.ConcreteClass;
import main.ConcreteClass1;
import main.ConcreteClass2;
import main.Enumeration;
import main.GenericClass1;
import main.GenericClass2;
import main.ImmutableClass;
import main.Register;
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

		Tools t01 = new Tools();
		Tools t02 = new Tools();

		t01.option = 'B';
		t02.option = 'C';

		System.out.println(t01.option);
		System.out.println(t02.option);

		Tools.option = 'D';
		Tools.printOption();

		Tools.display("Vai corinthians!");
		Tools.display(23.22);
		Tools.display(34.22f);

		double res = Tools.sum(33, 15.55);
		System.out.println(100 + res);

		System.out.println("Fim do roteiro 6.");
		System.out.println("----------------------------------");

		System.out.println("Inicio do roteiro 7.");

		ConcreteClass2 cc4 = new ConcreteClass2(7890);
		ConcreteClass cc5 = new ConcreteClass(7890);
		AbstractClass cc6 = new ConcreteClass(7890);

		System.out.println("Fim do roteiro 7.");
		System.out.println("----------------------------------");

		System.out.println("Inicio do roteiro 8.");

		// Enumeration test = new Enumeration(); essa linha não é possivel, pq não
		// podemos intanciar uma classe enumerate que não seja dentro dela mesma
		Enumeration test = Enumeration.ENUM_OBJECT_1;
		System.out.println(test);
		System.out.println(Enumeration.ENUM_OBJECT_2);
		// System.out.println(Enumeration.ENUM_OBJECT_3);
		// Enumeration.ENUM_OBJECT_1.value1 = 100;
		// System.out.println(test.value1);
		// System.out.println(test.value2);
		System.out.println(Enumeration.ENUM_OBJECT_1);
		System.out.println(Enumeration.ENUM_OBJECT_1.getValue1());
		System.out.println(Enumeration.ENUM_OBJECT_1.getValue2());

		for (int i = 0; i < Enumeration.values().length; i++) {
			System.out.println(Enumeration.values()[i]);
			System.out.println(Enumeration.values()[i].getValue1());
			System.out.println(Enumeration.values()[i].getValue2());
		}
		for (Enumeration enumTemp : Enumeration.values()) {
			System.out.println(enumTemp);
			System.out.println(enumTemp.getValue1());
			System.out.println(enumTemp.getValue2());
		}

		System.out.println("Fim do roteiro 8.");
		System.out.println("----------------------------------");

		System.out.println("Inicio do roteiro 9.");

		List<String> habitat = new ArrayList<>();
		/*
		 * habitat.add("Florestas Tropicais"); habitat.add("Florestas Deciduas");
		 * habitat.add("Bosques de Arbustos"); habitat.add("Terra Firma");
		 * habitat.add("Savanas");
		 */

		habitat.addAll(Arrays.asList("Florestas Tropicais", "Florestas Deciduas", "Bosques de Arbustos", "Terra Firma",
				"Savanas"));

		ImmutableClass ic1 = new ImmutableClass("Mustela putorius Furo", "Furão", 4, 2.5, habitat);
		System.out.println(ic1);

		habitat.clear();
		habitat.add("Oceanos");

		System.out.println(ic1);

		System.out.println(ic1.getHABITAT());

		ImmutableClass ic2 = new ImmutableClass("Galego cuvier", "Tubaão Tigre", 20, 250, habitat);

		System.out.println(ic2);

		System.out.println("Fim do roteiro 9.");
		System.out.println("----------------------------------");

		System.out.println("Inicio do roteiro 10.");

		List<String> habitat2 = new ArrayList<>();
		habitat2.addAll(Arrays.asList("Florestas Tropicais", "Florestas Deciduas", "Bosques de Arbustos", "Terra Firma",
				"Savanas"));

		Register reg1 = new Register("Mustela putorius Furo", "Furão", 4, 2.5, habitat2);
		System.out.println(reg1);
		habitat2.add("Oceanos");
		System.out.println(reg1);

		System.out.println("Fim do roteiro 10");
		System.out.println("----------------------------------");
		System.out.println("Inicio do roteiro 11.");

		/*
		 * System.out.println("Inicio do roteiro 11."); GenericClass1 gc1 = new
		 * GenericClass1(); gc1.setPassword(1234); Object password = gc1.getPassword();
		 * password = (int) password + 1222; System.out.println(password);
		 * System.out.println(gc1.getPassword()); GenericClass1 gc2 = new
		 * GenericClass1(); gc2.setPassword("SenhaLouca"); System.out.println(gc2);
		 */

		GenericClass1<String> gc1 = new GenericClass1<>();
		gc1.setPassword("senha Maluca");
		System.out.println(gc1.getPassword());

		GenericClass1<Integer> gc2 = new GenericClass1<>();
		gc2.setPassword(8987);
		System.out.println(gc2.getPassword());

		GenericClass2<Integer, String> gc3 = new GenericClass2();
		gc3.setDescription("Nuru");
		gc3.setPassword(123321);
		System.out.println(gc3.getDescription() + " " + gc3.getPassword());

		System.out.println("Fim do roteiro 11");
		System.out.println("----------------------------------");
		System.out.println("Inicio do roteiro 12.");

		Character char1 = 'A';
		Tools.display(char1);

		Method[] methods = Tools.class.getDeclaredMethods();
		for (Method temp : methods) {
			if (temp.isAnnotationPresent(Annotation1.class)) {
				Annotation1 a1 = temp.getAnnotation(Annotation1.class);
				System.out.println("Método anotado: " + temp.getName());
				System.out.println("Conteúdo da Anotação: " + a1.value());
			}
			if(temp.isAnnotationPresent(Annotation2.class)) {
				System.out.println("Olá, sou Annotation2 e passei por aqui também");
			}
		}
	}

}
