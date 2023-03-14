package com.cursoceat.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Nota cancion[]= {Nota.DO ,Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
	Piano p = new Piano();
	for ( Nota nota: cancion) {
		p.anadir(nota);
	}
	p.interpretar();
	
	}

}
