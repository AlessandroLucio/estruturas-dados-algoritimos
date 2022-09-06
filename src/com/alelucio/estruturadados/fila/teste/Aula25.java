package com.alelucio.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

import com.alelucio.estruturadados.fila.Paciente;

public class Aula25 {

	public static void main(String[] args) {
		Queue<Paciente> fila = new PriorityQueue();//api que ordena
		
		fila.add(new Paciente("A", 2));
		fila.add(new Paciente("C", 1));
		fila.add(new Paciente("B", 3));
		
		System.out.println(fila);
		
		System.out.println(fila.remove());
		
		System.out.println(fila);
		
	}

}
