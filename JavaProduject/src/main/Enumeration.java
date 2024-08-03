package main;

public enum Enumeration {
	//objects
	ENUM_OBJECT_1(123, "Texto"), 
	ENUM_OBJECT_2(456, "Texto2"),
	ENUM_OBJECT_3(234, "texto3");
	//ENUM_OBJECT_4(10);
	
	
	//Properties
	private final int value1;
	private final String value2;
	
	//Constructors
	/*
	private Enumeration() {
		value1 = 123;
		value2 = "Texto Generico";
	}
	
	private Enumeration(int value1) {
		this.value1 = value1;
		value2 = "Texto só para o value1 de parametro";
	}
	*/
	private Enumeration(int value1, String value2) {
	this.value1 = value1;
	this.value2 = value2;	
	}

	
	
	//Behaviours
	
	public int getValue1() {
		return value1;
	}

	public String getValue2() {
		return value2;
	}
	
}
