package section4_3;

public class RecursionTest {

	public static void main(String[] args) {
		System.out.println(forward(2));
		
		System.out.println(backward(5));
		
		
	}
	
	public static double forward(double limit) {
		double num1 = 5, result = 0;
		for (int i = 1; i <= limit; i++) {
			result += num1;
		}
		return result;
	}
	
	public static double backward(double limit) {
		double num1 = 5;
		if(limit <= 1) {
			return num1;
		}else {
			return backward(limit -1) + num1;
		}
		
	}

}
