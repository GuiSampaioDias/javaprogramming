package database.crud;

import java.sql.Date;


public class FilmeModel {
	//Properties
	private String codigo;
	private String titulo;
	private String genero;
	private String produtora;
	private Date dataCompra;
	
	//Constructors
	public FilmeModel() {
		
	}

	public FilmeModel(String codigo, String titulo, String genero, String produtora, Date dataCompra) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.produtora = produtora;
		this.dataCompra = dataCompra;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProduto(String produtora) {
		this.produtora = produtora;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public String toString() {
		return "FilmeModel [codigo=" + codigo + ", titulo=" + titulo + ", genero=" + genero + ", produtora=" + produtora
				+ " data compra="+ dataCompra +"]";
	}
	
	
	

}
