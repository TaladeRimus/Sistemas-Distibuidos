package Exercicios;

import Threads.Processo;

public class Primeiro {
	
	private static Processo p;

	public static void main(String[] args) {
		
		
		System.out.println("Exercicio 1:");
		p = new Processo();
		p.processoPar();
		p.processoImpar();
		
	}

}
