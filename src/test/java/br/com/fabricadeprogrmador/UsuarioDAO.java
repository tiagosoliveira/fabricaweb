package br.com.fabricadeprogrmador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogrmador.entidade.Usuario;
import br.com.fabricadeprogrmador.persistencia.jdbc.ConexaoFactory;

public class UsuarioDAO {
private Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usu) {
		String sql = "insert into usuario (nome, login, senha) values (?,?,?)";
		try {
			//Criando um Statment
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome()); //substitui o ? pelo dado do usuário
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			//Executando o comando SQL no banco
			preparador.execute();
			//fechando o objeto preparador
			preparador.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

