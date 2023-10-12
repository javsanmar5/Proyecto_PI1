package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lector {
	
	public static List<ParejaNumeros> leeDatos(String rutaFichero) {
		
		List<ParejaNumeros> listaParejas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                ParejaNumeros pareja = parseParejaNumeros(linea);
                if (pareja != null) {
                    listaParejas.add(pareja);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
        
        return listaParejas;
		
	}
	
	private static ParejaNumeros parseParejaNumeros(String datos) {
		String[] splits = datos.split(",");
		Integer a = Integer.parseInt(splits[0].trim());	
		Integer b = Integer.parseInt(splits[1].trim());	
		
		return new ParejaNumeros(a, b);
		
	}
	
	public record ParejaNumeros(Integer a, Integer b) {}
	
}