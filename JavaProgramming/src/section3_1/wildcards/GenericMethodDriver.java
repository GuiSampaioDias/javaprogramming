package section3_1.wildcards;
import java.util.ArrayList;

public class GenericMethodDriver {

	public static void main(String[] args) {
		String[] stringArray = {"Esta", "é", "uma", "matriz"};
		Integer[] intArray = {1,2,3,4};
		
		GenericMethodClass gmc =  new GenericMethodClass();
		gmc.printArray(stringArray);
		gmc.printArray(intArray);
		
		ArrayList<Double> array1 = new ArrayList<>();
		array1.add(25.84);
		array1.add(33.4);
		array1.add(25.78);
		array1.add(99.12);
		gmc.printArrayList(array1);
		gmc.displayArrayList(array1);
		
		ArrayList<Integer> array2 = new ArrayList<>();
		array2.add(25);
		array2.add(33);
		array2.add(2578);
		array2.add(992);
		gmc.printArrayList(array2);
		gmc.displayArrayList(array2);
		
		ArrayList<String> array3 = new ArrayList<>();
		array3.add("Esta");
		array3.add("é");
		array3.add("outra");
		array3.add("atriz");
		gmc.printArrayList(array3);
		gmc.displayArrayList(array3);
		
		System.out.println(gmc.sumOfArrayList(array1));
		System.out.println(gmc.sumOfArrayList(array2));
		
	}

}
