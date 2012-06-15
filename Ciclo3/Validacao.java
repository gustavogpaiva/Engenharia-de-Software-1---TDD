package Ciclo3;

public class Validacao {
	
	int codigo;
	
	public boolean Valida(int codigo){
		
		int valor, valorAux, acumulado=0;
		int []pesos = {2,3,4,5,6,7};
		
		String codigoStr = ""+codigo; //transforma código em string		
	
		for(int i=0; i<6; i++){
			String aux = ""+codigoStr.charAt(i); //converte o digito para string
			valorAux = Integer.parseInt(aux); // converte a string em inteiro
			valor= valorAux*pesos[i]; //multiplica o peso pelo dígito
			acumulado += valor; // acumula o valor
		}
		
		valorAux = acumulado%11; // pega o mod de 11
		valor = 11-valorAux; // subtrai de 11
		
		String codigoAux = ""+codigo;
		codigoAux = ""+codigoAux.charAt(9);
		codigo = Integer.parseInt(codigoAux);
		
		if(valor == codigo)
			return true;
		else
			return false;
		
	}
	
	public int Pontos(int codigo){
		
		int valor;
		String valorAux = null;
		String codigoStr = ""+codigo; // converte o codigo para string
		String codigoAux;
		
		for(int i=0; i<3; i++){
			codigoAux = ""+codigoStr.charAt(i); //dígito convertido para string
			valorAux = "" + valorAux + codigoAux;
		}
		
		valor = Integer.parseInt(valorAux);	
		return valor;
	}

}
