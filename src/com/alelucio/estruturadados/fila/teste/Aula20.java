package com.alelucio.estruturadados.fila.teste;

import com.alelucio.estruturadados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
	
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		System.out.println("Elementos da fila: " + fila);
		
		System.out.println("Primeiro elemento da fila: " + fila.espiar());
		System.out.println("Tamanho da fila: " + fila.tamanho());
		System.out.println("Fila está vazia: " + fila.estaVazia());
		
		
		System.out.println("Desenfileira: " + fila.desenfileira());
		System.out.println("Desenfileira: " + fila.desenfileira());
		System.out.println("Desenfileira: " + fila.desenfileira());
		System.out.println("Elementos da fila: " + fila);
	}

}
