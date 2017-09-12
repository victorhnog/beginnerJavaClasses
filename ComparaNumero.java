package org.meuprimeiroscript;

class ComparaNumero{
	static void comparacaoDeNumeros(int primeiroNumero, int segundoNumero){
		if(primeiroNumero == segundoNumero){
			System.out.printf("Os numeros %d e %d sao iguais", primeiroNumero, segundoNumero);
		}else{
			if(primeiroNumero > segundoNumero){
				System.out.printf("Os numeros %d e %d sao diferentes, sendo que %d eh maior que %d", primeiroNumero, segundoNumero, primeiroNumero, segundoNumero);
			}else{
				System.out.printf("Os numeros %d e %d sao diferentes, sendo que %d eh maior que %d", segundoNumero, primeiroNumero, segundoNumero, primeiroNumero);
			}
		}
	}
	public static void main(String[] args){

	}
}