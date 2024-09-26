package com.servicios;

import com.entidades.Carta;
import com.entidades.Naipe;

import java.util.ArrayList;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;

	public Juego(ArrayList<String> idsJugadores) {
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();

		cartasJugadores = new ArrayList<>();

		for (int i = 0; i < idsJugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}

	public Juego() {
		naipe = new Naipe();
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int jugadorCount = cartasJugadores.size();
		int indexCarta = 0;

		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < jugadorCount; j++) {
				if (indexCarta < naipeBarajado.size()) {
					cartasJugadores.get(j).add(naipeBarajado.get(indexCarta));
					indexCarta++;
				}
			}
		}
	}

	public int devolverTotal(int idJugador) {
		int total = 0;

		if (idJugador >= 0 && idJugador < cartasJugadores.size()) {
			ArrayList<Carta> cartasDelJugador = cartasJugadores.get(idJugador);

			for (int i = 0; i < cartasDelJugador.size(); i++) {
				total += cartasDelJugador.get(i).getNumero().getValor();
			}
		}

		return total;
	}

	public int determinarGanador() {
		int idGanador = 0;
		int sumaGanador = devolverTotal(idGanador);

		for (int i = 1; i < cartasJugadores.size(); i++) {
			int sumaActual = devolverTotal(i);

			if (sumaActual >= sumaGanador) {
				sumaGanador = sumaActual;
				idGanador = i;
			}
		}

		return idGanador;
	}

}
