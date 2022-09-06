package exercicios;

import com.alelucio.estruturadados.vetor.Lista;

public class Exerc3 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista(3);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		lista.remove("A");		
		System.out.println(lista);
		
		lista.remove("D");
		System.out.println(lista);
		
		lista.remove("F");
		System.out.println(lista);
	}

}
