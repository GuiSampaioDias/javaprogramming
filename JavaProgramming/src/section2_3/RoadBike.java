package section2_3;

public class RoadBike extends Bicicleta{
	//Propriedades específicas
	private String tipoDePedal;
	
	
	//Construtores
	public RoadBike() {}


	public RoadBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantMarchas,
			double velocMedia, String tipoDePedal) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantMarchas, velocMedia);
		this.tipoDePedal = tipoDePedal;
	}


	// Comportamentos
	
	public String getTipoDePedal() {
		return tipoDePedal;
	}


	public void setTipoDePedal(String tipoDePedal) {
		this.tipoDePedal = tipoDePedal;
	}


	@Override
	public String toString() {
		return "RoadBike [tipoDePedal=" + tipoDePedal + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
