package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu = new Calculadora();
		int resultadoSuma = calcu.sumar(5, 8);
		double resultadoResta = calcu.restar(10, 3);
		
		System.out.println("RESULTADO SUMA: " + resultadoSuma);
		System.out.println("RESULTADO RESTA: " + resultadoResta);
		
		double resultadoMultiplicacion = calcu.multiplicar(10, 5);
		System.out.println("RESULTADO MULTIPLICACION: " + resultadoMultiplicacion);
		
		double resultadoDivision = calcu.dividir(10, 2);
		System.out.println("RESULTADO DIVISON: " + resultadoDivision);
	}

}