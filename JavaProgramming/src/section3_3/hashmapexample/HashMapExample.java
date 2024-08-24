package section3_3.hashmapexample;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, String> fruitBowl = new HashMap<>();
		
		fruitBowl.put("Maça", "Verde");
		fruitBowl.put("Cereja", "Vermelha");
		fruitBowl.put("Laranja", "Laranja");
		fruitBowl.put("Banana", "Amarela");
		fruitBowl.put(null, null);
		fruitBowl.put("Banana", null );
		fruitBowl.put("Uva", "Verde" );
		fruitBowl.put("Laranja", "Amarela" );
		
		
		//System.out.println(fruitBowl);
		
		for(String arrTemp : fruitBowl.keySet()) {
			System.out.println(arrTemp + " " + fruitBowl.get(arrTemp));
		}
		
		for(HashMap.Entry<String, String> arrTemp : fruitBowl.entrySet()) {
			System.out.println(arrTemp.getKey() + " : " + arrTemp.getValue());
		}
		
		findElementy(fruitBowl, "Maça");
		findElementy(fruitBowl, "banana");
		
	}
	
	private static void findElementy(HashMap<String, String> fruitBowl, String fruit) {
		if(fruitBowl.containsKey(fruit)) {
			System.out.println("A " +  fruit + " é " + fruitBowl.get(fruit));
		}else {
			System.out.println("Não há " + fruit + " na cesta");
		}
	}

}
