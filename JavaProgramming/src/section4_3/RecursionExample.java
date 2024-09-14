package section4_3;

public class RecursionExample {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
		System.out.println(fatorial2(5));
		recurseMethod(0);
		System.out.println(fibonacci(5));
		System.out.println(fibonacci2(5));
		

	}
	
	public static int fatorial(int num) {
		int result = num;
		for (int i = num -1 ; i > 0; i--)
		result *= i ;
		
		return result;
	}

	public static int fatorial2(int num) {
		
		if(num <= 1) {
			return 1;
		}else {
			return num * fatorial(num - 1);
		}	
	}
	public static void recurseMethod(int num) {
		if(num ==0) {
			return;
		}else {
			System.out.println("Hello "+ num);
			recurseMethod(num-1);
			System.out.println("" + num);
			return;
		}
	}
	
	public static int fibonacci(int index) {
		int[] fib = new int[index];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i< index; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
				
		
		
		return fib[index-1];
	}
	
	public static int fibonacci2(int index) {
		if(index -1 <= 1) {
			return index -1;
		}
		return fibonacci2(index-1) + fibonacci2(index-2);
	}
}
