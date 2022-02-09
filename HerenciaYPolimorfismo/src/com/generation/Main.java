package com.generation;

public class Main {

	public static void main(String[] args) {
		//Herencia: cuando una clase hereda de otra, esta
		//tiene acceso a sus atributos y métodos
		
		Cuadrado cuadrado1 = new Cuadrado();
		//cuadrado1.setNombre("Cuadrado");
		//Después de agregar el constructor a la clase Cuadrado
		//Ya solo se pone lo de la línea 9
		
		cuadrado1.setAlto(15);
		cuadrado1.setLargo(15);
		System.out.println("El área del " + cuadrado1.getNombre() 
				+ " es " + cuadrado1.calcularArea());	
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(12);
		triangulo1.setLargo(16);
		System.out.println("El área del " + triangulo1.getNombre() 
				+ " es " + triangulo1.calcularArea());	
		
	}

}
