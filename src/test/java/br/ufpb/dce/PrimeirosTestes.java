package br.ufpb.dce;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.model.Usuario;
import br.ufpb.dce.service.UsuarioService;

public class PrimeirosTestes {

	private UsuarioService usuarioService;

	@Before
	public void beforeTests() {
		this.usuarioService = new UsuarioService();
	}

	@Test
	public void criarUsuarioValido() {
		Usuario usuario = new Usuario();
		usuario.setNome("Fernando");
		usuario.setSobrenome("Oliveira");
		usuario.setSexo(true);
		usuario.setCpf("578.638.543-42");
		usuarioService.salvar(usuario);

		Usuario usuarioCadastrado = this.usuarioService
				.buscarUsuarioPorCpf("578.638.543-42");
		Assert.assertEquals("578.638.543-42", usuario.getCpf());
		Assert.assertEquals("Fernando", usuarioCadastrado.getNome());
		Assert.assertEquals("Oliveira", usuarioCadastrado.getSobrenome());
		Assert.assertTrue(usuarioCadastrado.isSexo());
	}
}
