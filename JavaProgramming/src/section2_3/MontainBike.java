package section2_3;

public class MontainBike extends Bicicleta {

	//Propriedades especificas
	private String tipoDeAmortecedor;
	
	//Construtores
	public MontainBike() {}

	public MontainBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantMarchas,
			double velocMedia, String tipoDeAmortecedor) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantMarchas, velocMedia);
		this.tipoDeAmortecedor = tipoDeAmortecedor;
		
	}
	
	//Comportamentos

	public String getTipoDeAmortecedor() {
		return tipoDeAmortecedor;
	}

	public void setTipoDeAmortecedor(String tipoDeAmortecedor) {
		this.tipoDeAmortecedor = tipoDeAmortecedor;
	}

	@Override
	public String toString() {
		return "MontainBike [tipoDeAmortecedor=" + tipoDeAmortecedor + ", getCodigo()=" + getCodigo()
				+ ", getTipoDeQuadro()=" + getTipoDeQuadro() + ", getTipoDeRoda()=" + getTipoDeRoda() + ", getAro()="
				+ getAro() + ", getQuantMarchas()=" + getQuantMarchas() + ", getVelocMedia()=" + getVelocMedia()
				+ ", toString()=" + super.toString() + "]";
	}

	

	
	
	
	
}
