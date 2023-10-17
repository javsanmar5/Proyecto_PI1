package tests;

import java.util.List;

import ejercicios.Ejercicio3;
import us.lsi.streams.Stream2;

public class TestEjercicio3 {

	public static void main(String[] args) {
		
		List<String> l3_1A = Stream2.file("./data/PI1Ej3DatosEntrada1A.txt").toList();
		List<String> l3_1B = Stream2.file("./data/PI1Ej3DatosEntrada1B.txt").toList();
		List<String> l3_2A = Stream2.file("./data/PI1Ej3DatosEntrada2A.txt").toList();
		List<String> l3_2B = Stream2.file("./data/PI1Ej3DatosEntrada2B.txt").toList();
		List<String> l3_3A = Stream2.file("./data/PI1Ej3DatosEntrada3A.txt").toList();
		List<String> l3_3B = Stream2.file("./data/PI1Ej3DatosEntrada3B.txt").toList();
		
		
		//METODO ITERATIVO
		System.out.println("\nTest ejercicio 3. Metodo ITERATIVO.");
		System.out.println("Test 1: " + Ejercicio3.ejercicio3Iter(l3_1A, l3_1B));
		System.out.println("Test 2: " + Ejercicio3.ejercicio3Iter(l3_2A, l3_2B));
		System.out.println("Test 3: " + Ejercicio3.ejercicio3Iter(l3_3A, l3_3B));

		//METODO RECURSIVO FINAL
		System.out.println("\nTest ejercicio 3. Metodo RECURSIVO FINAL.");
		System.out.println("Test 1: " + Ejercicio3.ejercicio3RecFinal(l3_1A, l3_1B));
		System.out.println("Test 2: " + Ejercicio3.ejercicio3RecFinal(l3_2A, l3_2B));
		System.out.println("Test 3: " + Ejercicio3.ejercicio3RecFinal(l3_3A, l3_3B));

	}

}
