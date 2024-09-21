package cadastrar_pessoas;

public class Cadastrar {

	private int id;
	private String nome;
	private String sobrenome;
	private String genero;
	private String nascimento;
	private int idade;
	
	public Cadastrar(int id, String nome, String sobrenome, String genero, String nascimento, int idade) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.genero = genero;
		this.nascimento = nascimento;
		this.idade = idade;
	}
}
