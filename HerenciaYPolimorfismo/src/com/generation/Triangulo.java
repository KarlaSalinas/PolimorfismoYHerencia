package com.generation;

public class Triangulo extends FiguraGeometrica{
	
	//Se declara constructor
	public Triangulo() {
		//Llamando al constructor padre (El que esta en FiguraGeometrica)
		super("Triángulo");
	}
	
	
	//Por polimorfismo modificar el calculo del área
	@Override
	public float calcularArea() {
		return ((getAlto() * getLargo())/2);
	}


	@Override
	public float perimetro() {
		float valor1 = (float) Math.pow(getAlto(), 2);
		float valor2 = (float) Math.pow((getAlto()/2), 2);
		return (float) (getLargo() + 2*(Math.sqrt(valor1 + valor2)));
		//return (getLargo() + 2*(raiz(getAlto()^2 + (getLargo()/2)^2)));
	}
}
