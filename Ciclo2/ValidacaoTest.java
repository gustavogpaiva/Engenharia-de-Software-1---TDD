package Ciclo2;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.*;

public class ValidacaoTest extends TestCase{
	
	Validacao objeto;
	int codVerif;
	
	@BeforeClass
	public void criaAmbiente(){
		objeto.codigo = 1234567895;
	}
	
	@Test
	public void testValida(int codigo){
		assertEquals(true, objeto.Valida(objeto.codigo));		
	}
	
	@Test
	public void testPontos(int codigo){
		assertEquals(123,objeto.Pontos(objeto.codigo));
	}

}
