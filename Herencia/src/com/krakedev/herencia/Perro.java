package com.krakedev.herencia;

public class Perro extends Animal {
	public Perro() {
		super(); //es implícito siempre va a llamar al constructor vacío del papá
		System.out.println("Ejecuta constructor Perro");
	}
	
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro durmiendo");
	}
}