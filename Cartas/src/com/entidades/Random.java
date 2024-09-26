package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		int valorRandom = (int) (Math.random() * 52);
		return valorRandom;
	}
}
