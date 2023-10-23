package tests;

import java.util.List;

import ejercicios.Ejercicio2;
import us.lsi.streams.Stream2;

public class TestEjercicio2 {

	public static void main(String[] args) {

		String path = "./ficheros/PI1Ej2DatosEntrada.txt";
		List<ParejaNumeros> l2 = Stream2.file(path).map(TestEjercicio2::parseParejaNumeros).toList();		
		
		System.out.println("Test ejercicio 2:");
		
		//VERSION FINAL
		for(int i = 0; i< l2.size(); i++) {
			System.out.print("\nMetodo RECURSIVO NO FINAL.	");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio2.ejercicio2RecursivoNoF(l2.get(i).a(), l2.get(i).b()));

			System.out.print("Metodo RECURSIVO FINAL. 	");
			System.out.println("Test " + (i + 1) + ": " + Ejercicio2.ejercicio2RecursivoF(l2.get(i).a(), l2.get(i).b()));

			System.out.print("Metodo ITERATIVO. 		");
			System.out.println("Test " + (i+1) + ": " + Ejercicio2.ejercicio2Iter(l2.get(i).a(), l2.get(i).b()));
			
			System.out.print("Metodo FUNCIONAL. 		");
			System.out.println("Test " + (i+1) + ": " + Ejercicio2.ejercicio2Func(l2.get(i).a(), l2.get(i).b()));

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
