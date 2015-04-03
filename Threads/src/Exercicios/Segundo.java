package Exercicios;

import java.util.Scanner;

import Threads.Processo;

public class Segundo {
	
	private static Processo p;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Quantas threads deseja ? ");
		int tr = sc.nextInt();
		p = new Processo();
		
		for (int i = 0; i < tr; i++) {
						
			p.processo();
			
		}
		
	}

}
