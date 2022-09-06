package com.alelucio.estruturadados.teste;

import java.util.ArrayList;
import java.util.List;

public class Aula12 {
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		
		arrayList.add(1, "B");//adiciona pelo index
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("D");//m�todo contains retorna um booleano
		if(existe) {
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento n�o existe no array");
		}
		
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array " + pos);
		}else {
			System.out.println("Elemento n�o existe no array " + pos);
		}
		
		System.out.println(arrayList.get(2));//m�todo que busca por posi��o
		
		arrayList.remove(0);
		arrayList.remove("B");		
	
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
	}
}
