package com.entidades;

import com.servicios.Juego;
import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;

	// Constructor
	public Jugadores() {
		jugadores = new ArrayList<>();
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	public void jugar() {
		ArrayList<String> jugadores = new ArrayList<>();
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");

		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);

		for (int i = 0; i < jugadores.size(); i++) {
			int total = juego.devolverTotal(i);
			System.out.println("Total del " + jugadores.get(i) + ": " + total);
		}

		int ganador = juego.determinarGanador();
		System.out.println("El ganador es: " + jugadores.get(ganador));
	}
	
}
