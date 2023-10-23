package tests;

import java.util.List;

import ejercicios.Ejercicio1;
import us.lsi.streams.Stream2;

public class TestEjercicio1 {

	public static void main(String[] args) {
		
		String path = "./ficheros/PI1Ej1DatosEntrada.txt";
		List<ParejaNumeros> l1 = Stream2.file(path).map(TestEjercicio1::parseParejaNumeros).toList();
	
		System.out.println("Test ejercicio 1:");
		
		for(int i = 0; i < l1.size(); i++) {
			
			System.out.print("\nMetodo ENUNCIADO (FUNCIONAL).	");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio1.ejercicio1(l1.get(i).a(), l1.get(i).b()));
	
			System.out.print("Metodo ITERATIVO.		");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio1.ejercicio1Iter(l1.get(i).a(), l1.get(i).b()));
			
			System.out.print("Metodo RECURSIVO FINAL.		");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio1.ejercicio1Recur(l1.get(i).a(), l1.get(i).b()));
		
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
