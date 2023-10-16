package test;

import java.util.List;
import main.Ejercicio4;
import us.lsi.streams.Stream2;

public class TestEjercicio4 {

	public static void main(String[] args) {
		
		String path = "./data/PI1Ej4DatosEntrada.txt";
		List<ParejaNumeros> l4 = Stream2.file(path).map(TestEjercicio4::parseParejaNumeros).toList();

		//METODO RECURSIVO SIN MEMORIA
		System.out.println("Test ejercicio 4. Metodo RECURSIVO SIN MEMORIA.");
		for(int i = 0; i < l4.size(); i++) {
			System.out.println("Test " + (i + 1) + ": " + Ejercicio4.ejercicio4RecSinMem(l4.get(i).a(), l4.get(i).b()));
		}
				
		//METODO RECURSIVO CON MEMORIA
		System.out.println("\nTest ejercicio 4. Metodo RECURSIVO CON MEMORIA.");
		for(int i = 0; i < l4.size(); i++) {
			System.out.println("Test " + (i + 1) + ": " + Ejercicio4.ejercicio4RecConMem(l4.get(i).a(), l4.get(i).b()));
		}
		
		
		//METODO ITERATIVO IMPERATIVO
		System.out.println("\nTest ejercicio 4. Metodo ITERATIVO IMPERATIVO.");
		for(int i = 0; i < l4.size(); i++) {
			System.out.println("Test " + (i + 1) + ": " + Ejercicio4.ejercicio4Iter(l4.get(i).a(), l4.get(i).b()));
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
