package br.com.fabricadeprogrmador;

import br.com.fabricadeprogrmador.entidade.Usuario;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		//Criando o Usu�rio
		Usuario usu = new Usuario();
		usu.setNome("J�oz�o");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		//Cadastrando usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");
	}

}
