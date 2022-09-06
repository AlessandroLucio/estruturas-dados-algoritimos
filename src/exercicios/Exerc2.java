package exercicios;

import com.alelucio.estruturadados.vetor.Lista;

public class Exerc2 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista(3);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimaPos("A"));
	}

}
