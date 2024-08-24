package section3_2.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<String> studentNames = new ArrayList<>();
		
		addStudentes(studentNames);
		desplayStudents(studentNames);
		Collections.sort(studentNames);
		desplayStudents(studentNames);
	}

	private static void addStudentes(ArrayList<String> studentNames) {
		studentNames.add("Carlos");
		studentNames.add("Guilherme");
		studentNames.add("Fernando");
		studentNames.add("Alonso");
		studentNames.add("Pedro");
		studentNames.add("Pedro");
	}
	private static void desplayStudents(ArrayList<String> studentNames) {
		for (String arrTemp : studentNames) {
			System.out.println("Nome do estudante: " + arrTemp);
		}
	}
}
