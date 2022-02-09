package com.generation;

public class Main {

	public static void main(String[] args) {
		//Herencia: cuando una clase hereda de otra, esta
		//tiene acceso a sus atributos y m�todos
		
		Cuadrado cuadrado1 = new Cuadrado();
		//cuadrado1.setNombre("Cuadrado");
		//Despu�s de agregar el constructor a la clase Cuadrado
		//Ya solo se pone lo de la l�nea 9
		
		cuadrado1.setAlto(15);
		cuadrado1.setLargo(15);
		System.out.println("El �rea del " + cuadrado1.getNombre() 
				+ " es " + cuadrado1.calcularArea());	
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(12);
		triangulo1.setLargo(16);
		System.out.println("El �rea del " + triangulo1.getNombre() 
				+ " es " + triangulo1.calcularArea());	
		
	}

}
