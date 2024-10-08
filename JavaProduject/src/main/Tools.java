package main;

public class Tools {
	//Properties
	public static char option = 'A';// nesse caso não precisamos instanciar  por causa do static.
	public char alternative = 'a';// nesse caso precisamos instanciar a classe 
	
	//Behaviors
	@Annotation2
	public static void printOption() {
		System.out.println(option);
	}
	public static void printAlternative() {
		char altern = 'z';
		System.out.println(altern);
		printOption();
	}
	public void printOp() {
		System.out.println(option);
	}
	@Annotation2
	public static void display(String str) {
		System.out.println(str);
		System.out.println("Este é um " +((Object) str).getClass().getName());;
	}
	public static void display(double num) {
		System.out.println(num);
		System.out.println("Este é um " +((Object) num).getClass().getName());;
	}
	public static void display(float flo) {
		System.out.println(flo);
		System.out.println("Este é um " +((Object) flo).getClass().getName());;
	}
	
	@Annotation1("Metodo genérico utilizado")
	public static <T> void display(T info){
		System.out.println(info);
	}
	
	public static double sum(double num1, double num2 ) {
		double res = num1 + num2;
		System.out.println(res);
		return res;
	}
	
	
}
