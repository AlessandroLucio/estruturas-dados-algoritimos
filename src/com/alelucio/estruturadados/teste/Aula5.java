package com.alelucio.estruturadados.teste;

import com.alelucio.estruturadados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		System.out.println(vetor.busca(1));
		System.out.println(vetor.buscaPos("Elemento 2"));
	}

}
