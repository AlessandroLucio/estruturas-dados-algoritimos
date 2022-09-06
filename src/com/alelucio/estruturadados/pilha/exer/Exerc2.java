package com.alelucio.estruturadados.pilha.exer;

import java.util.Scanner;

import com.alelucio.estruturadados.pilha.Pilha;

public class Exerc2 {
	public static void main(String[] args) {
		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=10;i++) {
			
			System.out.println("Entre com um número: ");
			
			Integer num = scan.nextInt();			
			
			if(num == 0) {
				
				Integer desempilhado = par.desempilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha par está vazia");
				}else {
					System.out.println("Desempilhando da pilha par " + desempilhado);
				}
				
				desempilhado = impar.desempilha();
				
				if(desempilhado == null) {
					System.out.println("Pilha impar está vazia");
				}else {
					System.out.println("Desempilhando da pilha impar " + desempilhado);
				}
			}
			
			if(num % 2 == 0) {
				System.out.println("Emprilhando numero par");
				par.empilha(num);
			}else{
				System.out.println("Emprilhando numero impar");
				impar.empilha(num);
			}
		}
		System.out.println("Pilhar par");
		System.out.println(par + "\n");
		System.out.println("Pilhar impar");
		System.out.println(impar + "\n");
		
		System.out.println("Desempilhando pilha dos números pares");
		while(!par.estaVazia()) {
			System.out.println("Desempilhando: " + par.desempilha());
		}
		
		System.out.println("Desempilhando pilha dos números impares");
		while(!impar.estaVazia()) {
			System.out.println("Desempilhando: " + impar.desempilha());
		}
		
		System.out.println("Pilhar par");
		System.out.println(par + "\n");
		System.out.println("Pilhar impar");
		System.out.println(impar + "\n");
		
		scan.close();
	}
}
