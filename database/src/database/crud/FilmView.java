package database.crud;

import java.sql.Date;
import java.util.Scanner;

public class FilmView {
	/*
	private FilmeController filmeController;
	
	public FilmView(FilmeController filmeController) {
		this.filmeController = filmeController;
	}

	*/
	public void displayMenu() {
		MySQLConnection db = new MySQLConnection();
		try {
			if(!db.getConnection()) {
				System.out.println("Erro ao conectar com o banco de dados!");
				return;
				
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		FilmDAO filmDAO = new FilmDAO(db);
		
		FilmeController filmeController = new FilmeController(filmDAO);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nMenu: ");
			System.out.println("0 Sair do programa");
			System.out.println("1. Cadastrar filmes");
			System.out.println("2. Listar filmes");
			System.out.println("3. Atualizaf Cadastro");
			System.out.println("4. Deletar Filme");
			
			System.out.println("Digite sua opção: ");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch(option){
				case 0 -> {
					System.out.println("Programa finalizado!");
					sc.close();
					db.closeConnection();
					System.exit(0);
					break;
				}
				case 1 -> {
					System.out.print("Digite o código do filme: ");
					String codigo = sc.nextLine();
					System.out.print("Digite o Título do filme: ");
					String titulo = sc.nextLine();
					System.out.println("Digite o genero do filme");
					String genero = sc.nextLine();
					System.out.print("Digite a produtora do filme: ");
					String produtora = sc.nextLine();
					System.out.print("Digite a data da compra");
					Date dataCompra = Date.valueOf(sc.nextLine());
					
					
					FilmeModel filme = new FilmeModel(codigo, titulo, genero, produtora, dataCompra);
					filmeController.creatFilm(filme);
					
				}
				case 2 ->{
					filmeController.readFilm();
				}
				case 3 ->{
					System.out.print("Digite o código do filme para autalizar: ");
					String codigo = sc.nextLine();
					System.out.print("Digite o Título do filme: ");
					String titulo = sc.nextLine();
					System.out.print("Digite o genero do filme");
					String genero = sc.nextLine();
					System.out.print("Digite a produtora do filme: ");
					String produtora = sc.nextLine();
					System.out.print("Digite a data da compra");
					Date dataCompra = Date.valueOf(sc.nextLine());
					
					FilmeModel filme = new FilmeModel(codigo, titulo, genero, produtora, dataCompra);
					filmeController.updateFilm(filme);
				}
				case 4 ->{ 
					System.out.print("Digiti o código do filme que deseja deletar: ");
					String codigo = sc.nextLine();
					filmeController.deleteFilm(codigo);
				}
				default -> System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
	}

}
