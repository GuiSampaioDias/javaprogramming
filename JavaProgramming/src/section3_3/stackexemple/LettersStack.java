package section3_3.stackexemple;

import java.util.LinkedList;

public class LettersStack {
	
public static void main(String[] args) {
		
		LinkedList<Character> letterKtk = new LinkedList<>();
		
		letterKtk.push('A');
		letterKtk.push('B');
		letterKtk.push('C');
		letterKtk.push('D');
		System.out.println("Linked List " + letterKtk);
		System.out.println("Tamanho da fila: " + letterKtk.size());
		
		letterKtk.pop();
		System.out.println("Linked List " + letterKtk);
		
		letterKtk.pop();
		System.out.println("Linked List " + letterKtk);
		
	}

}
