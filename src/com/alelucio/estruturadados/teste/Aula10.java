	package com.alelucio.estruturadados.teste;

import com.alelucio.estruturadados.vetor.Contato;
import com.alelucio.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
				
		Contato c1 = new Contato("Contato 1", "111-111", "contato1@gmail");
		Contato c2 = new Contato("Contato 2", "222-222", "contato2@gmail");
		Contato c3 = new Contato("Contato 3", "333-333", "contato3@gmail");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);
			
	}

}
