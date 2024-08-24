package section3_3.queueexample;

import java.util.LinkedList;

public class LettersQueue {

	public static void main(String[] args) {
		
		LinkedList<Character> lettersq = new LinkedList<>();
		
		lettersq.add('A');
		lettersq.add('B');
		lettersq.add('C');
		lettersq.add('D');
		System.out.println("Linked List " + lettersq);
		System.out.println("Tamanho da fila: " + lettersq.size());
		
		lettersq.remove();
		System.out.println("Linked List " + lettersq);
		
		lettersq.remove();
		System.out.println("Linked List " + lettersq);
		
	}

}
