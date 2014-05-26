package br.ufpb.dce.service;

import java.util.ArrayList;
import java.util.List;

import br.ufpb.dce.model.Usuario;

public class UsuarioService {

	private List<Usuario> usuarios;
	
	public UsuarioService(){
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void salvar(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public Usuario buscarUsuarioPorCpf(String cpf) {
		for(Usuario usuario : this.usuarios){
			if(usuario.getCpf().equals(cpf)){
				return usuario;
			}
		}
		return null;
	}

}
