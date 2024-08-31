package section3_4;

public class SortExample {

	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1, 3, 6, 34, 55, 3, 2};
		displayNumbers(numbers);
		selectionSort(numbers);
		System.out.println();
		displayNumbers(numbers);
		
		System.out.println();
		
		int x =binarySearch(numbers, 34);
		System.out.println(x);
		
		

	}
	
	public static void displayNumbers(int[] numbers) {
		for(int arrTemp : numbers) {
			System.out.print(arrTemp + " ");
		}
	}
	
	public static void selectionSort(int[] numbers) {
		int indexMin = 0;
		
		for(int i = 0 ; i < numbers.length; i++) {
			indexMin = i;
			for(int j = i +1 ; j < numbers.length; j++) {
				if(numbers[j] < numbers[indexMin]) {
					indexMin = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[indexMin];
			numbers[indexMin] = temp;
		}
		
	}
	
	public static int binarySearch(int[] numbers, int target) {
		int indexMin = 0;
		int indexMax =numbers.length -1;
		while(indexMin <= indexMax) {
			int indexMid = (indexMin + indexMax) / 2;
			if (numbers[indexMid] == target) {
				System.out.println("O número " + target + " está na posição " + (indexMid + 1) + " da lista" );
				return indexMid;
			}
			if(numbers[indexMid]> target) {
				indexMax = indexMid -1;
			}
			else {
				indexMin = indexMid + 1;
			}
		}
		return -1;
	}

}
