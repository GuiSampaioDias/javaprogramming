package section3_1.wildcards;

import java.util.ArrayList;

public class GenericMethodClass {
	
	public <T> void printArray(T[] array) {
		for (T arrTemp : array) {
			System.out.print(arrTemp +  " ");
		}
		System.out.println();
	}
	
	public <T> void printArrayList(ArrayList<T> array) {
		for (T arrTemp : array) {
			System.out.print(arrTemp +  " ");
		}
		System.out.println();
	}
	
	public  void displayArrayList(ArrayList<?> array) {
		for (Object arrTemp : array) {
			System.out.print(arrTemp +  " ");
		}
		System.out.println();
	}
	
	public double sumOfArrayList(ArrayList<? extends Number> arrayList) {
		double sum = 0.0;
		for( Number arrTemp :arrayList) {
			sum += arrTemp.doubleValue();
		}
		return sum;
	}
	
	public void addNumbers(ArrayList<? super Integer> arrayList) {
		for(int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
	}
	

}
