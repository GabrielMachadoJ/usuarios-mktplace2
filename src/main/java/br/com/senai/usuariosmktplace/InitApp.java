package br.com.senai.usuariosmktplace;

import br.com.senai.usuariosmktplace.core.domain.Usuario;
import br.com.senai.usuariosmktplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		
		UsuarioService service = new UsuarioService() ;
		
		Usuario user = service.criarPor("luiz henrique pereira", "luiz1234");
	
		System.out.println("aqui");
		System.out.println(user.toString());
		
	}

}
