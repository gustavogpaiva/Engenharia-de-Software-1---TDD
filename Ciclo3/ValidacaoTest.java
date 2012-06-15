package Ciclo3;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.*;

public class ValidacaoTest extends TestCase{
	
	Validacao objValidacao;
	
	@BeforeClass
	public void criaAmbiente(){
		objValidacao.codigo = 1234567895;
	}
	
	@Test
	public void testValida(int codigo){
		assertEquals(true, objValidacao.Valida(objValidacao.codigo));		
	}
	
	@Test
	public void testPontos(int codigo){
		assertEquals(123,objValidacao.Pontos(objValidacao.codigo));
	}

}
