package com.generation;

public class Cuadrado extends FiguraGeometrica {
	
	//Se declara el constructor
	public Cuadrado() {
		//Llamando al constructor padre (El que esta en FiguraGeometrica)
		super("Cuadrado");
	}

	@Override
	public float calcularArea() {
		return (getLargo() * getAlto());
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return ((getLargo()*2) + (getAlto()*2));
	}
}
