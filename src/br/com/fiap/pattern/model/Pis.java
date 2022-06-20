package br.com.fiap.pattern.model;

import java.util.Observable;

// Observable significa que a classe está sendo observada pelos outros métodos
public class Pis extends Observable implements Imposto {
	
	private float aliquota = 0.6f;
	
	private float valorPis;

	@Override
	public void calcularImposto(float valor) {
		
		setChanged(); //avisa que haverá uma mudança
		valorPis = valor * aliquota;
		notifyObservers(getValorPis()); // notifica que houve uma mudança aqui
		
	}

	public float getValorPis() {
		return valorPis;
	}

}
