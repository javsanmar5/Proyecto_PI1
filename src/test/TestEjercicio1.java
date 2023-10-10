package test;

import main.Ejercicio1;

public class TestEjercicio1 {

	public static void main(String[] args) {
		
		toPrint();
		
	}
	
	
	private static void toPrint() {
		//PRUEBAS DEL EJERCICIO 1:
		//Código muestra:
		String resEjercicio1Muestra1 = Ejercicio1.ejercicio1(2, 30);
		String resEjercicio1Muestra2 = Ejercicio1.ejercicio1(4, 50);
		String resEjercicio1Muestra3 = Ejercicio1.ejercicio1(3, 7);
		
		//Código iterativo:
		String resEjercicio1Iter1 = Ejercicio1.ejercicio1Iter(2, 30);
		String resEjercicio1Iter2 = Ejercicio1.ejercicio1Iter(4, 50); 
		String resEjercicio1Iter3 = Ejercicio1.ejercicio1Iter(3, 7);
		
		//Código recursivo:
		String resEjercicio1Recur1 = Ejercicio1.ejercicio1Recur(2, 30);
		String resEjercicio1Recur2 = Ejercicio1.ejercicio1Recur(4, 50); 
		String resEjercicio1Recur3 = Ejercicio1.ejercicio1Recur(3, 7);
		
	
		System.out.println("Ejercicios resueltos con el método proporcionado de muestra;");
		System.out.println(resEjercicio1Muestra1);
		System.out.println(resEjercicio1Muestra2);
		System.out.println(resEjercicio1Muestra3);
		
		System.out.println("\nEjercicios resueltos con el método iterativo;");
		System.out.println(resEjercicio1Iter1);
		System.out.println(resEjercicio1Iter2);
		System.out.println(resEjercicio1Iter3);
		
		System.out.println("\nEjercicios resueltos con el método recursivo;");
		System.out.println(resEjercicio1Recur1);
		System.out.println(resEjercicio1Recur2);
		System.out.println(resEjercicio1Recur3);
		
		
	}
	
}
