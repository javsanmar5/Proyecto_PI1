package main;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
		
	//METODO ITERATIVO
	public static List<String> ejercicio3Iter(List<String> a, List<String> b) {
	    List<String> res = new ArrayList<>();
	    int i = 0;
	    
	    while (i < a.size() || i < b.size()) {
	        if (i < a.size()) {
	            res.add(a.get(i));
	            if ( i + 1 < a.size()) {
	            	res.add(a.get(i + 1));
	            }
	        }
	        if (i < b.size()) {
	            res.add(b.get(i));
	            if ( i + 1 < b.size()) {
		            res.add(b.get(i + 1));
	            }
	        }
	        i += 2;
	    }

	    return res;
	}
	
	//METODO RECURSIVO FINAL
	public static List<String> ejercicio3RecFinal(List<String> a, List<String> b){
		List<String> acum = new ArrayList<>();
		return ejercicio3RecFinal(acum, 0, a , b);
	}

	private static List<String> ejercicio3RecFinal(List<String> acum, int i, List<String> a, List<String> b) {
		
		if (i < a.size() || i < b.size()) {
			if (i < a.size()) {
	            acum.add(a.get(i));
	            if ( i + 1 < a.size()) {
	            	acum.add(a.get(i + 1));
	            }
			}
			if (i < b.size()) {
	            acum.add(b.get(i));
	            if ( i + 1 < b.size()) {
		            acum.add(b.get(i + 1));
	            }
	        }
			ejercicio3RecFinal(acum, i + 2, a, b);
		}
		return acum;
	}

	
	//METODO FUNCIONAL
	public static record Tupla(List<String> l, List<String> a, List<String> b) {
		public static Tupla first(List<String> a, List<String> b) {
			return new Tupla(new ArrayList<String>(), a, b);
		}
		
//		public Tupla next() {
//			
//		}
	}
	
	
}









