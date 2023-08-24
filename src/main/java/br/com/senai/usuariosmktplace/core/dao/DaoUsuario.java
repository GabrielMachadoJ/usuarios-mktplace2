package br.com.senai.usuariosmktplace.core.dao;

import java.util.List;

import br.com.senai.usuariosmktplace.core.domain.Usuario;

public interface DaoUsuario {
	
	public void inserir(Usuario usuario );
	
	public void altera(Usuario usuario);

	public Usuario buscarPor(String nome );
	
	public List<Usuario> listarPorLogin(); 
}
