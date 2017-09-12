package org.meuprimeiroscript;

class TrocaNumeros{
	static void retornaNumerosTrocados(int NumA, int NumB){
		int NumC;
		NumC = NumA;
		NumA = NumB;
		NumB = NumC;
		System.out.printf("NumA: %d\n", NumA);
		System.out.printf("NumB: %d\n", NumB);
	}
	public static void main(String[] args){

	}
}