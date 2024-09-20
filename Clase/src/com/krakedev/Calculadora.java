package com.krakedev;

public class Calculadora {
	
	public int sumar(int valor1,int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}
	
	public double restar (int valor1,int valor2) {
		double resultado = valor1 - valor2;
		return resultado;
	}
	
	public double multiplicar(double valor1,double valor2) {
		double resultado = valor1 * valor2;
		return resultado;
	}
	
	public double dividir(double valor1,double valor2) {
		double resultado = valor1 / valor2;
		return resultado;
	}
	
	public double promedio(double valor1,double valor2,double valor3) {
		double resultado = (valor1 + valor2 + valor3) / 3;
		return resultado;
	}
	
}