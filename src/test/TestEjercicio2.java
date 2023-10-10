package test;

import java.util.List;

import main.Ejercicio2;

public class TestEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toPrint();
		
	}
	
	private static void toPrint() {
		
		//PRUEBAS DEL EJERCICIO 2:
		//Código recursivoFinal:
		List<Integer> resEjercicio2RecFinal1 = Ejercicio2.ejercicio2RecFinal(5, 8);
		List<Integer> resEjercicio2RecFinal2 = Ejercicio2.ejercicio2RecFinal(2, 7);
		List<Integer> resEjercicio2RecFinal3 = Ejercicio2.ejercicio2RecFinal(9, 19);
		
		System.out.println("Ejercicios resueltos con el método recursivo final;");
		System.out.println(resEjercicio2RecFinal1);
		System.out.println(resEjercicio2RecFinal2);
		System.out.println(resEjercicio2RecFinal3);
		
		
	}

}
