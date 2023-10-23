package tests;

import java.util.List;

import ejercicios.Ejercicio4;
import us.lsi.streams.Stream2;

public class TestEjercicio4 {

	public static void main(String[] args) {
		
		String path = "./ficheros/PI1Ej4DatosEntrada.txt";
		List<ParejaNumeros> l4 = Stream2.file(path).map(TestEjercicio4::parseParejaNumeros).toList();

		System.out.println("Test ejercicio 4: ");
		
		for(int i = 0; i < l4.size(); i++) {
			System.out.print("\nMetodo RECURSIVO SIN MEMORIA.	");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio4.ejercicio4RecSinMem(l4.get(i).a(), l4.get(i).b()));
					
			System.out.print("Metodo RECURSIVO CON MEMORIA.	");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio4.ejercicio4RecConMem(l4.get(i).a(), l4.get(i).b()));
			
			System.out.print("Metodo ITERATIVO IMPERATIVO.	");
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
