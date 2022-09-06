package com.alelucio.estruturadados.pilha.exer;

import java.util.Stack;

public class Exerc7 {
	public static void main(String[] args) {
		imprimeResultado(2);
		imprimeResultado(4);
		imprimeResultado(10);
		imprimeResultado(25);
		imprimeResultado(10035);		
	}
	
	public static void imprimeResultado(int numero) {
		System.out.println(numero + " em bin�rio �: " + decimalBinario(numero));
	}
	
	public static String decimalBinario(int numero) {
		
		Stack<Integer> pilha = new Stack<>();
		String numBinario = "";
		int resto;
		
		while(numero > 0) {
			resto = numero % 2;
			pilha.push(resto);
			numero /= 2;
		}
		while(!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}
		return numBinario;
	}
}
