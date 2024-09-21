package database.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
	public Connection conn;
	private final MySQLConnection db;

	public FilmDAO(MySQLConnection db) {
		this.db = db;

	}

	public boolean create(FilmeModel filme) throws SQLException {
		Connection conn = db.conn;

		if (conn == null) {
			return false;
		}
		String cmdSQL = "INSERT INTO filmes (codigo, titulo,genero,produtora,dataCompra) values (?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(cmdSQL);
		ps.setString(1, filme.getCodigo());
		ps.setString(2, filme.getTitulo());
		ps.setString(3, filme.getGenero());
		ps.setString(4, filme.getProdutora());
		ps.setDate(5, filme.getDataCompra());

		int modfyLine = ps.executeUpdate();
		ps.close();
		// conn.close(); Não podemos fechar aqui, porem deve ser fechado em algum
		// momento
		System.out.println("Filme salvo com sucesso!");

		return modfyLine > 0;

	}
	
	public List<FilmeModel> read() throws SQLException{
		List<FilmeModel> filmes = new ArrayList<>();
		Connection conn = db.conn;
		
		if(conn == null) {
			return filmes;
		}
		String cmdSQL = "Select * From filmes";
		PreparedStatement ps = conn.prepareStatement(cmdSQL);
		ResultSet rs = ps.executeQuery();
	
		while(rs.next()) {
			FilmeModel filme = new FilmeModel(rs.getString("codigo"),
					                          rs.getString("titulo"),
											  rs.getString("genero"),
											  rs.getString("produtora"),
											  rs.getDate("dataCompra")
											  );
			filmes.add(filme);
		}
		rs.close();
		ps.close();
		return filmes;
	}
	
	public boolean update(FilmeModel filme) throws SQLException {
		Connection conn = db.conn;

		if (conn == null) {
			return false;
		}
		String cmdSQL = " UPDATE filmes SET titulo = ?, genero = ?,produtora = ?, dataCompra = ? WHERE codigo = ?";
		PreparedStatement ps = conn.prepareStatement(cmdSQL);
		ps.setString(1, filme.getTitulo());
		ps.setString(2, filme.getGenero());
		ps.setString(3, filme.getProdutora());
		ps.setDate(4, filme.getDataCompra());
		ps.setString(5, filme.getCodigo());

		int modfyLine = ps.executeUpdate();
		ps.close();
		// conn.close(); Não podemos fechar aqui, porem deve ser fechado em algum
		// momento
		System.out.println("Filme salvo com sucesso!");

		return modfyLine > 0;
	}
	public boolean delete(String codigo) throws SQLException{
		Connection conn = db.conn;
		
		if(conn == null) {
			return false;
		}
		String cmdSQL = "DELETE FROM filmes WHERE codigo = ?";
		PreparedStatement ps =  conn.prepareStatement(cmdSQL);
		ps.setString(1, codigo);
		
		int modifyLines = ps.executeUpdate();
		ps.close();
		return modifyLines > 0;
		
		
	}
	
}
