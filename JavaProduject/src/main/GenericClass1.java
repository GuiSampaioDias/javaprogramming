package main;

public class GenericClass1<Type>{
	//Properties
	private Type password;
	
	//Constructors
	public GenericClass1() {}
	
	public GenericClass1(Type password) {
		this.password = password;
	}
	
	//Behaviors
	
	public Type getPassword(){
		return password ;
	}
	public void setPassword(Type password) {
		this.password = password; 
	}
	/*public Type getType() {
		return ((password) flo).getClass().getName();
	}*/
}
