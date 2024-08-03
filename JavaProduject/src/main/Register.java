package main;

import java.util.ArrayList;
import java.util.List;

public record Register(String SCIENTIFICNAME, String POPULARNAME, int AGE, double MASS,List<String> HABITAT) {
	public Register{
		HABITAT = new ArrayList<>(HABITAT);
	}
	@Override
	public List<String> HABITAT(){
		return new ArrayList<>(HABITAT);
	}
	@Override
	public String toString() {
		return "Nome Científico = " + SCIENTIFICNAME + "\nNome Popular = " + POPULARNAME + "\nIdade = " + AGE + "\nMASSa="
				+ MASS  +  "\nHambiente = " + HABITAT;
	}
}
