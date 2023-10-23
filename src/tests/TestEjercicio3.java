package tests;

import ejercicios.Ejercicio3;

public class TestEjercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Test ejercicio 3:");
		
		for(int i = 1; i <= 3; i++) {
			String ficheroA = "./ficheros/PI1Ej3DatosEntrada" + i + "A.txt";
			String ficheroB = "./ficheros/PI1Ej3DatosEntrada" + i + "B.txt";
			
			System.out.print("\nMetodo ITERATIVO.		");
			System.out.println("Test " + i + ": " + Ejercicio3.ejercicio3Iter(ficheroA, ficheroB));
			
			System.out.print("Metodo RECURSIVO FINAL.		");
			System.out.println("Test " + i + ": " + Ejercicio3.ejercicio3RecFinal(ficheroA, ficheroB));
			
			System.out.print("Metodo FUNCIONAL.		");
			System.out.println("Test " + i + ": " + Ejercicio3.ejercicio3Funcional(ficheroA, ficheroB));
		}
		
	}

}
