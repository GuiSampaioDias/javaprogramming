package main;

public class GenericClass1{
	//Properties
	private Object password;
	
	//Constructors
	public GenericClass1() {
		password = 4566;
	}
	
	public GenericClass1(Object password) {
		this.password = password;
	}
	
	//Behaviors
	
	public Object getPassword(){
		return password ;
	}
	public void setPassword(Object password) {
		this.password = password; 
	}
	/*public Type getType() {
		return ((password) flo).getClass().getName();
	}*/
}
