package test;

import java.util.List;

import main.Ejercicio2;
import us.lsi.streams.Stream2;

public class TestEjercicio2 {

	public static void main(String[] args) {

		String path = "./data/PI1Ej2DatosEntrada.txt";
		List<ParejaNumeros> l2 = Stream2.file(path).map(TestEjercicio2::parseParejaNumeros).toList();
		
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
		
		//METODO FUNCIONAL
		System.out.println("\nTest ejercicio 2. Metodo FUNCIONAL.");
		for(int i = 0; i < l2.size(); i++) {
			System.out.println("Test " + (i+1) + ":" + Ejercicio2.ejercicio2Func(l2.get(i).a(), l2.get(i).b()));
		}
		
		
	}
	
	
	private static ParejaNumeros parseParejaNumeros(String datos) {
		String[] splits = datos.split(",");
		Integer a = Integer.parseInt(splits[0].trim());	
		Integer b = Integer.parseInt(splits[1].trim());	
		
		return new ParejaNumeros(a, b);
		
	}
	

	public record ParejaNumeros(Integer a, Integer b) {}
	
}
