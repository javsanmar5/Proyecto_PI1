package test;

import java.util.List;

import main.Ejercicio2;
import test.Lector.ParejaNumeros;

public class TestEjercicio2 {

	public static void main(String[] args) {

		List<ParejaNumeros> l2 = Lector.leeDatos("./data/PI1Ej2DatosEntrada.txt");
		
		//METODO RECURSIVO NO FINAL
		System.out.println("Test ejercicio 2. Metodo RECURSIVO NO FINAL.");
		for(int i = 0; i < l2.size(); i++) {
			System.out.println("Test " + (i + 1) + ": " + Ejercicio2.ejercicio2RecursivoNoF(l2.get(i).a(), l2.get(i).b()));
		}
		
		//METODO RECURSIVO FINAL
		System.out.println("\nTest ejercicio 2. Metodo RECURSIVO FINAL.");
		for(int i = 0; i < l2.size(); i++) {
			System.out.println("Test " + (i + 1) + ": " + Ejercicio2.ejercicio2RecursivoF(l2.get(i).a(), l2.get(i).b()));
		}
		
		
		//METODO ITERATIVO
		System.out.println("\nTest ejercicio 2. Metodo ITERATIVO.");
		for(int i = 0; i < l2.size(); i++) {
			System.out.println("Test " + (i+1) + ":" + Ejercicio2.ejercicio2Iter(l2.get(i).a(), l2.get(i).b()));
		}
		
		
	}
	
}
