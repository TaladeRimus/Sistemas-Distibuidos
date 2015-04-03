package Threads;

import java.util.Random;

public class Processo {
	
	static Random r = new Random();
	
	public void processo(){
		
		new Thread(tr).start();
		
	}
	
	public void processoPar(){
		new Thread(par).start();
	}
	
	public void processoImpar(){
		new Thread(impar).start();
	}
	
	public static void counter(String tr, int i){
		System.out.println("O contador é: " + i + " e a thread é a: " + tr);
	}
	
	private static Runnable par = new Runnable() {
		
		public void run(){
			
			try {
				
				for (int i = 0; i <= 20; i++) {
					
					if((i % 2 ) == 0){
						
						counter("par", i);
						Thread.sleep(r.nextInt(10));
					}
					
				}
				
			} catch (Exception e) {
				System.err.println("Erro: " + e);
			}
			
		}
		
	};
	
	private static Runnable impar = new Runnable() {
		
		public void run(){
			
			try {
				
				for (int i = 0; i <= 20; i++) {
					
					if(( i % 2 ) == 1 ){
						
						counter("impar", i);
						Thread.sleep(r.nextInt(10));
						
					}
				}
				
			} catch (Exception e) {
				System.err.println("Erro: " + e);
			}
			
		}
		
	};
	
	private static Runnable tr = new Runnable(){
		
		public void run(){
			try{
				for (int i = 0; i <= 20; i++) {
					
					counter("T", i);
					Thread.sleep(r.nextInt(10));
				}
				
			}catch(Exception e){
				System.err.println("Erro: " + e);
			}
		}
		
	};
	
}
