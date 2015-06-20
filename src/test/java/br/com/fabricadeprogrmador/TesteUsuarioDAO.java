package br.com.fabricadeprogrmador;

import br.com.fabricadeprogrmador.entidade.Usuario;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		//Criando o Usuário
		Usuario usu = new Usuario();
		usu.setNome("Jãozão");
		usu.setLogin("jzao");
		usu.setSenha("123");
		
		//Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");
	}

}
