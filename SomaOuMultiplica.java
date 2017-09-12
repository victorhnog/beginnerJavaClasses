package org.meuprimeiroscript;

class SomaOuMultiplica{
	static void mostraSomaOuMultiplica(){
		int somaDosNumeros = 0;
		int multiplicacaoDosNumeros = 0;
		
		for(int numero = 5; numero >= 0; numero--){
			if(numero%2 == 0){
				 multiplicacaoDosNumeros = multiplicacaoDosNumeros*numero;
			}else{
				somaDosNumeros = somaDosNumeros+numero;
			}
		}
		
		System.out.printf("A multiplicaco dos numeros e: %d\n", multiplicacaoDosNumeros);
		System.out.printf("A soma dos numeros e: %d\n", somaDosNumeros);
	}
	
	public static void main(String[] args) {
		
	}
}