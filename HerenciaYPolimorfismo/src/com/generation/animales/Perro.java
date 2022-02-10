package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar{

	@Override
	public void jugar() {
		System.out.println("Estoy jugando a la pelota");
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un auto");
	}

	@Override
	public void baniar() {
		System.out.println("Me gusta el agua");
	}

	@Override
	public void moverLaColita() {
		System.out.println("Me gusta el agua");
	}

	@Override
	public void jugarConCajas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ensuciarse() {
		// TODO Auto-generated method stub
		
	}
	
}
