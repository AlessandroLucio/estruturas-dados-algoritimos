package com.alelucio.estruturadados.pilha.teste;

import java.util.Stack;

import com.alelucio.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();

		Stack<Integer> stack = new Stack<Integer>();//o Stack ordena o Deque não ordena
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack);
		
		System.out.println(stack.peek());//espiar
		
		System.out.println(stack.pop());//remove
		
		System.out.println(stack);

	}
}
