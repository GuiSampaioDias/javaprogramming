package database.crud;

import java.sql.SQLException;
import java.util.List;

public class FilmeController {
	private final FilmDAO filmDAO;

	public FilmeController(FilmDAO filmDAO) {
		this.filmDAO = filmDAO;
	}

	public void creatFilm(FilmeModel filme) {
		try {
			if (filmDAO.create(filme)) {
				System.out.println("filme criado com sucesso!");
			} else {
				System.out.println("Erro ao criar o filme!");
			}
		} catch (SQLException e) {
			System.out.println("Erro na base de dadeos: " + e.getMessage());
		}
	}

	public void readFilm() {
		try {
			List<FilmeModel> filmes = filmDAO.read();
			if (filmes.isEmpty()) {
				System.out.println("Nunhum filme cadastrado!");
			} else
				System.out.println("Listagem de Filmes: ");
			for (FilmeModel arrtemp : filmes) {
				System.out.println(arrtemp);
			}
		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
	}

	public void updateFilm(FilmeModel filme) {
		try {
			if (filmDAO.update(filme)) {
				System.out.println("Filme atualizado com sucesso!");
			} else {
				System.out.println("Erro ao atualizar o filme!");
			}
		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
	}

	public void deleteFilm(String codigo) {
		try {
			if (filmDAO.delete(codigo)) {
				System.out.println("Filme deletado com sucesso!");
			} else {
				System.out.println("Erro ao deletar filme!");
			}
		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
	}

}
