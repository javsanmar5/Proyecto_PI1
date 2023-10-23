package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import us.lsi.streams.Stream2;

public class Ejercicio3 {
		
	//METODO ITERATIVO
	public static List<String> ejercicio3Iter(String pathA, String pathB) {

		Iterator<String> it1 = Stream2.file(pathA).iterator();
		Iterator<String> it2 = Stream2.file(pathB).iterator();
	    List<String> res = new ArrayList<>();
	    
	    while (it1.hasNext() || it2.hasNext()) {
	        if (it1.hasNext()) {
	            res.add(it1.next());
	            if (it1.hasNext()) {
	            	res.add(it1.next());
	            }
	        }
	        if (it2.hasNext()) {
	            res.add(it2.next());
	            if (it2.hasNext()) {
	            	res.add(it2.next());
	            }
	        }
	    }

	    return res;
	}
	
	//METODO RECURSIVO FINAL
	public static List<String> ejercicio3RecFinal(String pathA, String pathB){
		Iterator<String> it1 = Stream2.file(pathA).iterator();
		Iterator<String> it2 = Stream2.file(pathB).iterator();
	    List<String> res = new ArrayList<>();
		return ejercicio3RecFinal(res, it1, it2);
	}

	private static List<String> ejercicio3RecFinal(List<String> res, Iterator<String> it1, Iterator<String> it2) {
		
		if (it1.hasNext() || it2.hasNext()) {
			if (it1.hasNext()) {
	            res.add(it1.next());
	            if (it1.hasNext()) {
	            	res.add(it1.next());
	            }
	        }
	        if (it2.hasNext()) {
	            res.add(it2.next());
	            if (it2.hasNext()) {
	            	res.add(it2.next());
	            }
	        }
			ejercicio3RecFinal(res, it1, it2);
		}
		return res;
	}
	
	
	private static record Tupla(List<String> l, Iterator<String> it1, Iterator<String> it2) {
		private static Tupla first(String pathA, String pathB) {
			return new Tupla(new ArrayList<>(), Stream2.file(pathA).iterator(), Stream2.file(pathB).iterator());
		}
		
		private Tupla next() {
			if (it1.hasNext() || it2.hasNext()) {
				if (it1.hasNext()) {
		            l.add(it1.next());
		            if (it1.hasNext()) {
		            	l.add(it1.next());
		            }
		        }
		        if (it2.hasNext()) {
		            l.add(it2.next());
		            if (it2.hasNext()) {
		            	l.add(it2.next());
		            }
		        }
			}	
			return this;
		}
		
		public Boolean esCasoBase() {
			return !(it1.hasNext() || it2.hasNext());
		}
	}
	
	public static List<String> ejercicio3Funcional(String pathA, String pathB){
		
		Tupla t = Stream.iterate(Tupla.first(pathA, pathB), e -> e.next())
				.filter(e -> e.esCasoBase())
				.findFirst().get();
		
		return t.l();
	}

}
	









