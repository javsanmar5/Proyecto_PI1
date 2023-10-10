package test;

import java.util.List;

import main.Ejercicio2;

public class TestEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toPrint();
		
	}
	
	private static void toPrint() {
		
System.out.println("Ejercicio resuelto de forma recursiva no final:");
		
		List<Integer> ejercicio2RecursivoNoF1 = Ejercicio2.ejercicio2RecursivoNoF(5,8);
		List<Integer> ejercicio2RecursivoNoF2 = Ejercicio2.ejercicio2RecursivoNoF(13,9);
		List<Integer> ejercicio2RecursivoNoF3 = Ejercicio2.ejercicio2RecursivoNoF(15,26);
		
		System.out.println(ejercicio2RecursivoNoF1);
		System.out.println(ejercicio2RecursivoNoF2);
		System.out.println(ejercicio2RecursivoNoF3);
		
		
		//Ejercicio 2 recursivo final.
		System.out.println("\nEjercicio resuelto de forma recursiva final:");
		
		List<Integer> ejercicio2RecursivoF1 = Ejercicio2.ejercicio2RecursivoF(5,8);
		List<Integer> ejercicio2RecursivoF2 = Ejercicio2.ejercicio2RecursivoF(13,9);
		List<Integer> ejercicio2RecursivoF3 = Ejercicio2.ejercicio2RecursivoF(15,26);

		System.out.println(ejercicio2RecursivoF1);
		System.out.println(ejercicio2RecursivoF2);
		System.out.println(ejercicio2RecursivoF3);
		
	}

}
