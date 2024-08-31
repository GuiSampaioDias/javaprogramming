package section3_3;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		//criando estudantes
		Student stu1 = new Student("Guilherme", "Sampaio Dias", 75);
		Student stu2 = new Student("Fernando", "Lins", 100);
		Student stu3 = new Student("Pedro", "Machado", 85);
		Student stu4 = new Student("Ana", "Safada", 100);
		Student stu5 = new Student("Paulinha", "Santos", 88);
		Student stu6 = new Student("Fabio", "Tomas", 44);
		
		//Criando Lista de studnates
		ArrayList<Student> lista = new ArrayList<>();
		lista.add(stu1);
		lista.add(stu2);
		lista.add(stu3);
		lista.add(stu4);
		lista.add(stu5);
		lista.add(stu6);
		
		displayLista(lista);
		
		Collections.sort(lista);
		System.out.println();
		
		displayLista(lista);
		
		//Classificando a lista de estudantes
		
		String str1 =  "Carlos";
		String str2 =  "Eduardo";
		System.out.println(str1.compareTo(str2));
		
		
	}
	public static void displayLista(ArrayList<Student> lista) {
		for(Student arrTemp: lista) {
			System.out.println(arrTemp);
		}
		
	}

}
