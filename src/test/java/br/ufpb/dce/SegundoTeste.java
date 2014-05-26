package br.ufpb.dce;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.dce.model.Usuario;

public class SegundoTeste {

	
	
	@Test
	public void testeUsuario(){
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("12345678909");
		usuario1.setNome("Maria");
		usuario1.setSexo(false);
		usuario1.setSobrenome("Fandas");
		assertEquals("12345678909", usuario1.getCpf());
		assertEquals("Maria", usuario1.getNome());
		assertFalse(usuario1.isSexo());
		assertEquals("Fandas", usuario1.getSobrenome());
	}

}
