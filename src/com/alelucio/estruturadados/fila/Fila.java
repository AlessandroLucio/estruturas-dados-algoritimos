package com.alelucio.estruturadados.fila;

import com.alelucio.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileira(T elemento) {
		//this.elementos[this.tamanho++] = elemento;		
		this.adiciona(elemento); //método da classe pai
	}
	
	public T espiar() {
		return this.elementos[0];		
	}
	
	public T desenfileira() {
		final int POS = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
	}
}
