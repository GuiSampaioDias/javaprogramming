package main;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
	//Generic Properties
	private final String SCIENTIFICNAME;
	private final String POPULARNAME;
	private final int AGE;
	private final double MASS;
	private final List<String> HABITAT;
	
	//Contructors
	
	public ImmutableClass(String SCIENTIFICNAME, String POPULARNAME, int AGE, double MASS,List<String> HABITAT) {
		this.SCIENTIFICNAME = SCIENTIFICNAME;
		this.POPULARNAME = POPULARNAME;
		this.AGE = AGE;
		this.MASS = MASS;
		this.HABITAT = new ArrayList<>(HABITAT);
	}
	
	//Generic Behaviors
	
	public String getSCIENTIFICNAME() {
		return SCIENTIFICNAME;
	}


	public String getPOPULARNAME() {
		return POPULARNAME;
	}

	
	public int getAGE() {
		return AGE;
	}

	
	public double getMASS() {
		return MASS;
	}

	public List<String> getHABITAT(){
		return new ArrayList<>(HABITAT);
	}

	@Override
	public String toString() {
		return "Nome Científico = " + SCIENTIFICNAME + "\nNome Popular = " + POPULARNAME + "\nIdade = " + AGE + "\nMASSa="
				+ MASS  +  "\nHambiente = " + HABITAT;
	}

}
